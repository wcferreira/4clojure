(ns easy.reverse-a-sequence)

;; Reverse a Sequence
;; Problem: Write a function which reverses a sequence.
;; Examples:
;;          (= (__ [1 2 3 4 5]) [5 4 3 2 1])
;;          (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
;;          (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

(defn reverse-sequence [s]
  (loop [lst () myseq s]
    (if (seq myseq)
      (recur
        (conj lst (first myseq))
        (rest myseq))
      lst)))

