(ns easy.dot-product)

;; Dot Product
;; Problem: Create a function that computes the dot product of two sequences. You may assume that the vectors will have the same length.
;; Examples:
;;           (= 0 (__ [0 1 0] [1 0 0]))
;;           (= 3 (__ [1 1 1] [1 1 1]))
;;           (= 32 (__ [1 2 3] [4 5 6]))
;;           (= 256 (__ [2 5 6] [100 10 1]))

(defn dot-product [s1 s2]
  (loop [sum 0 fs s1 sc s2]
    (if (and (empty? fs) (empty? sc))
      sum
      (recur
        (+ sum (* (first fs) (first sc)))
        (rest fs)
        (rest sc)))))