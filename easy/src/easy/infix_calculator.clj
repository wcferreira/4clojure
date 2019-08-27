(ns easy.infix-calculator)

;; Infix Calculator
;; Problem: Your friend Joe is always whining about Lisps using the prefix
;;          notation for math. Show him how you could easily write a function
;;          that does math using the infix notation. Is your favorite language
;;          that flexible, Joe? Write a function that accepts a variable length
;;          mathematical expression consisting of numbers and the operations +, -, *,
;;          and /. Assume a simple calculator that does not do precedence and instead
;;          just calculates left to right.
;; Examples:
;;          (= 7  (__ 2 + 5))
;;          (= 42 (__ 38 + 48 - 2 / 2))
;;          (= 8  (__ 10 / 2 - 1 * 2))
;;          (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))

(def op {:clojure.core$_PLUS_ +
         :clojure.core$_ -
         :clojure.core$_STAR_ *
         :clojure.core$_SLASH_ /})

(defn infix-calculator [& args]
  (println (keyword (first (clojure.string/split (str (nth args 1)) #"@")))))


(println ((:clojure.core$_PLUS_ op) 2 3) )