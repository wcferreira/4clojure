(ns easy.map-construction)


(defn create-map [s1 s2]
  (loop [new-map {} col1 s1 col2 s2]
    (if (and (seq col1) (seq col2))
      (recur
        (assoc new-map (first col1) (first col2))
        (rest col1)
        (rest col2))
      new-map)))

