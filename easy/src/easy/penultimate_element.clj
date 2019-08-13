(ns easy.penultimate-element)

;; Penultimate Element
;; Problem: Write a function which returns the second to last element from a sequence.
;; Examples:
;;           (= (__ (list 1 2 3 4 5)) 4)
;;           (= (__ ["a" "b" "c"]) "b")
;;           (= (__ [[1 2] [3 4]]) [1 2])


(defn get-penultimate-element [s]
  (let [max-size (count s)]
    (loop [index max-size]
      (if (> index (- max-size 2))
        (recur
          (dec index))
        (nth s index)))))


