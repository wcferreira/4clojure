(ns easy.palindrome-detector)

;; Palindrome Detector
;; Problem: Write a function which returns true if the given sequence is a palindrome.
;; Hint:    "racecar" does not equal '(\r \a \c \e \c \a \r)
;; Examples:
;;          (false? (__ '(1 2 3 4 5)))
;;          (true? (__ "racecar"))
;;          (true? (__ [:foo :bar :foo]))
;;          (true? (__ '(1 1 3 3 1 1)))
;;          (false? (__ '(:a :b :c)))

(defn palindrome-detector [s]
  (loop [lst () myseq s]
    (if (seq myseq)
      (recur
        (conj lst (first myseq))
        (rest myseq))
      (if (string? s)
        (= (clojure.string/join lst) s)
        (= lst s)))))




