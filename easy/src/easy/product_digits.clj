(ns easy.product-digits)

(defn prod-dig [n1 n2]
  (loop [lst () num (* n1 n2)]
    (if (<= num 10)
      (conj lst num)
      (recur
        (conj lst (mod num 10))
        (quot num 10)))))
