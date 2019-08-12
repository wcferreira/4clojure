(ns easy.cartesian-product-test
  (:require
    [clojure.test           :refer :all]
    [easy.cartesian-product :as cp]))


(deftest cartesian-product-test
  (is (= (cp/cart-prod #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
                       #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
                         ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
                         ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))

  (is (= (cp/cart-prod #{1 2 3} #{4 5}) #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))

  (is (= 300 (count
               (cp/cart-prod (into #{} (range 10))
                             (into #{} (range 30)))))))
