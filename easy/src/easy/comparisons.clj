(ns easy.comparisons)


(defn comparison [op n1 n2]
  (println op)
  (cond
    (= (class op) clojure.core$_LT_)  :gt
    (= (class op) clojure.core$_GT_)  :lt
    :else :eq))
