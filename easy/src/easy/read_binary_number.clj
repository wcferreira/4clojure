(ns easy.read-binary-number)

;; Read a binary number
;; Problem: Convert a binary number, provided in the form of a string, to its numerical value.
;; Examples:
;;          (= 0     (__ "0"))
;;          (= 7     (__ "111"))
;;          (= 8     (__ "1000"))
;;          (= 9     (__ "1001"))
;;          (= 255   (__ "11111111"))
;;          (= 1365  (__ "10101010101"))
;;          (= 65535 (__ "1111111111111111"))

(defn convert-bin-to-dec [s]
  (loop [coll []
         cnt 0
         input (reverse s)]
          (if (empty? input)
            (reduce + coll)
            (recur
              (conj coll (* (int (Math/pow 2 cnt)) (- (int (first input)) 48)))
              (inc cnt)
              (rest input)))))