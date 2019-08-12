(ns easy.cartesian-product)


(defn cart-prod [s1 s2]
  (into #{}
        (for [x s1
              y s2]
          [x y])))

(def offset 3)

;; 0 : 2
;; 3 : 5
;; 6 : 8