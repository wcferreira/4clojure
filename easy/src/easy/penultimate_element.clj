(ns easy.penultimate-element)

(def first-seq (list 1 2 3 4 5))
(def second-seq ["a" "b" "c" ])
(def third-seq [[1 2] [3 4]])

(defn get-penultimate-element [s]
  (let [max-size (count s)]
    (loop [index max-size]
      (if (> index (- max-size 2))
        (recur
          (dec index))
        (nth s index)))))


(defn foo [s]
  (when (seq s)
    (println s)
    (recur
      (rest s))))

(defn foo2 [s]
  (loop [cnt 0]
    (when (< cnt (count s))
      (println "#" cnt)
      (recur
        (inc cnt)))))

(defn foo3 [s]
  (loop [cnt (count s)]
    (if (> cnt (- (count s) 1))
      (recur
        (dec cnt))
      cnt)))

