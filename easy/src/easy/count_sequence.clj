(ns easy.count-sequence)

(def first-seq '(1 2 3 4 5))
(def second-seq "Hello World")
(def third-seq [[1 2] [3 4] [5 6]])
(def fourth-seq '(13))
(def fifth-seq '(:a :b :c))

(defn my-count [s]
  (loop [cnt 0 myseq s]
    (if (seq myseq)
      (recur
        (inc cnt)
        (rest myseq))
      cnt)))

(println (my-count first-seq))
(println (my-count second-seq))
(println (my-count third-seq))
(println (my-count fourth-seq))
(println (my-count fifth-seq))
