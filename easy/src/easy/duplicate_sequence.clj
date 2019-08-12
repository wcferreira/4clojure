(ns easy.duplicate-sequence)


(println "Duplicate"
         (reduce
           (fn [coll el]
             (conj coll el el)) [] [1 2 3]))


(defn duplicate-sequence [s]
  (reduce
    (fn [c e]
      (conj c e e)) [] s))


