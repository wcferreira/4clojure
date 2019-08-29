(ns medium.filter-perfect-squares)

;; Filter Perfect Squares
;; Problem: Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
;; Examples:
;;          (= (__ "4,5,6,7,8,9") "4,9")
;;          (= (__ "15,16,25,36,37") "16,25,36")


(defn filter-perfect-squares [xstr]
  (let [xcoll (map
                #(Integer.
                   (re-find #"\d+" %))
                (clojure.string/split xstr #","))

        result (for [x xcoll
                     :let [y (int (Math/sqrt x))]
                     :when (= x (int (Math/pow y 2)))]
                 x)]
    (clojure.string/join "," result)))
