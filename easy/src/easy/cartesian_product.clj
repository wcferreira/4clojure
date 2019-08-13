(ns easy.cartesian-product)

;; Cartesian Product
;; Problem: Write a function which calculates the Cartesian product of two sets.
;; Examples:
;;          (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
;;                 #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
;;                   ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
;;                   ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
;;          (= (__ #{1 2 3} #{4 5})
;;                 #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
;;          (= 300 (count (__ (into #{} (range 10))
;;                            (into #{} (range 30)))))

(defn cart-prod [s1 s2]
  (into #{}
        (for [x s1
              y s2]
          [x y])))

