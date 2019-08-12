(ns easy.palindrome-detector)


(defn palindrome-detector [s]
  (loop [lst () myseq s]
    (if (seq myseq)
      (recur
        (conj lst (first myseq))
        (rest myseq))
      (if (string? s)
        (= (clojure.string/join lst) s)
        (= lst s)))))




