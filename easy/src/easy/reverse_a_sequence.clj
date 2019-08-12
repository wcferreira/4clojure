(ns easy.reverse-a-sequence)


(defn reverse-sequence [s]
  (loop [lst () myseq s]
    (if (seq myseq)
      (recur
        (conj lst (first myseq))
        (rest myseq))
      lst)))

