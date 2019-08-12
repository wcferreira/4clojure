(ns easy.last-element)


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

