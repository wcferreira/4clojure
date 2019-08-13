(ns easy.count-sequence)

;; Count a Sequence
;; Problem: Write a function which returns the total number of elements in a sequence.
;; Example:
;;         (= (__ '(1 2 3 3 1)) 5)
;;         (= (__ "Hello World") 11)
;;         (= (__ [[1 2] [3 4] [5 6]]) 3)
;;         (= (__ '(13)) 1)
;;         (= (__ '(:a :b :c)) 3)

(defn my-count [s]
  (loop [cnt 0 myseq s]
    (if (seq myseq)
      (recur
        (inc cnt)
        (rest myseq))
      cnt)))
