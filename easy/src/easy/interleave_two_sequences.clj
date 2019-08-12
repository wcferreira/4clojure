(ns easy.interleave-two-sequences)


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
