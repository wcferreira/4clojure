(ns easy.implement-range)


(defn my-range [l h]
    (loop [coll [] lo l]
      (if (< lo h)
        (recur
          (conj coll lo)
          (inc lo))
        coll)))


(println "Hello")
