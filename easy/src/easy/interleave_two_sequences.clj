(ns easy.interleave-two-sequences)

;; Interleave Two Seqs
;; Problem: Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; Examples:
;;          (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
;;          (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
;;          (= (__ [1 2 3 4] [5]) [1 5])
;;          (= (__ [30 20] [25 15]) [30 25 20 15])


(defn my-interleave [s1 s2]
  (loop [coll [] ss1 s1 ss2 s2]
    (if (and
          (not (empty? ss1))
          (not (empty? ss2)))
      (recur
        (conj coll (first ss1) (first ss2))
        (rest ss1)
        (rest ss2))
      coll)))
