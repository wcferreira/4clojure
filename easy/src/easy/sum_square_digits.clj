(ns easy.sum-square-digits)


(defn sum-squared-digits [s]
  (for [x s
        :let [y (* x x)]
        :when (< x y)]
    x))


