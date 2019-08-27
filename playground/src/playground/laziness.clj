(ns playground.laziness)

;; (lazy-seq & body)
(defn positive-numbers
  ([] (positive-numbers 1))
  ([n]
   (lazy-seq
     (cons n
           (positive-numbers (inc n))))))

(defn lazy-positive-numbers [n]
  (println "executing" n) ; to know what's executing, returns a lazy seq of max 1+10 executions
  (lazy-seq
    (cons n
          (take n
                (lazy-positive-numbers
                  (inc n))))))

;;(lazy-positive-numbers 10)

(defn rep [f n]
  (lazy-seq
    (cons n
          (rep f (f n)))))

(defn custom-map
  ([f coll]
   (lazy-seq
     (when-let [s (seq coll)]
       (cons (f (first s)) (custom-map f (rest s)))))))


(defn foo []
   (->> (custom-map inc (range))
        (drop (dec 1000000))
        (take 2)))

;; https://clojure.org/reference/lazy