(ns easy.group-sequence)


(defn gen-seq [func coll]
  (for [x coll
        :let [key (> x 5)
              value (assoc {} key x)]]

    value)

  )

(defn gen-seq [func coll]
  (loop [new-map {} input coll]
    (if (empty? input)
      new-map
      ()

      )
    )

  )