(ns easy.re-implement-map)

;; Re-implement Map
;; Problem: Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.
;; Examples:
;;           (= [3 4 5 6 7]
;;              (__ inc [2 3 4 5 6]))

;;           (= (repeat 10 nil)
;;              (__ (fn [_] nil) (range 10)))

;            (= [1000000 1000001]
;               (->> (__ inc (range))
;                    (drop (dec 1000000))
;                    (take 2)))

(defn custom-map
  ([f coll]
   (lazy-seq
     (when-let [s (seq coll)]
       (cons (f (first s)) (custom-map f (rest s)))))))
