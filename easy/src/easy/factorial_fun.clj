(ns easy.factorial-fun)


(defn factorial-fun [n]
  {:pre [(pos? n)]}
  (reduce * (rest (range (+ n 1)))))

