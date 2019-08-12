(ns easy.fibonacci-sequence)

(def fib-seq-iterate
  (map first (iterate
               (fn [[a b]] [b (+ a b)]) [0 1])))


(defn fib [n]
  (rest
    (take (+ n 1)
          (map first (iterate
                       (fn [[a b]] [b (+ a b)]) [0 1])))))
