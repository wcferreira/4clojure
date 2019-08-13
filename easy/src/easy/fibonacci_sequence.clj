(ns easy.fibonacci-sequence)

;; Fibonacci Sequence
;; Problem: Write a function which returns the first X fibonacci numbers.
;; Examples:
;;          (= (__ 3) '(1 1 2))
;;          (= (__ 6) '(1 1 2 3 5 8))
;;          (= (__ 8) '(1 1 2 3 5 8 13 21))


(def fib-seq-iterate
  (map first (iterate
               (fn [[a b]] [b (+ a b)]) [0 1])))

(defn fib [n]
  (rest
    (take (+ n 1)
          (map first (iterate
                       (fn [[a b]] [b (+ a b)]) [0 1])))))
