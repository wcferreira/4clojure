(ns easy.last-element)

;; Last Element
;; Problem: Write a function which returns the last element in a sequence.
;; Examples:
;;          (= (__ [1 2 3 4 5]) 5)
;;          (= (__ '(5 4 3)) 3)
;;          (= (__ ["b" "c" "d"]) "d")

(def number-seq [1 2 3 4 5])
(def list-seq '(5 4 3))
(def string-seq ["b" "c" "d"])

(defn get-last-element [s]
  (loop [first-el nil my-seq s]
    (if (seq my-seq)
      (recur
        (first my-seq)
        (rest my-seq))
      first-el)))

