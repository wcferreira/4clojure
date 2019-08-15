(ns easy.sum-square-digits
  (:require [clojure.string :as str]))

;; Sum of square of digits
;; Problem: Write a function which takes a collection of integers as an argument. Return the count of how many elements are smaller than the sum of their squared component digits. For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
;; Examples:
;;          (= 8 (__ (range 10)))
;;          (= 19 (__ (range 30)))
;;          (= 50 (__ (range 100)))
;;          (= 50 (__ (range 1000)))



;(defn sum-squared-digits [s]
;  (count
;    (for [x s
;          :let [x-to-str (str x)
;                digits (str/split x-to-str #"")
;                digits-squared (reduce + (map #(* % %) (map read-string digits)))]
;          :when (< x digits-squared)]
;      x)))

;; Another Solution
;(defn sum-squared-digits [s]
;  (count
;    (for [x s
;          :let [x-to-str (str x)
;                digits (clojure.string/split x-to-str #"")
;                digits-squared (reduce + (map #(* % %)  (map #(Integer. (re-find #"\d+" %)) digits)))]
;          :when (< x digits-squared)
;          ]
;      x)))

;; Solution to please the 4clojure environment
(defn sum-squared-digits [s]
  (count
    (for [e s
          :let [ digits ((fn [num]
                           (loop [c [] n num]
                             (if (< n 10)
                               (conj c n)
                               (recur (conj c (mod n 10)) (quot n 10))))) e)

                digits-squared (reduce + (map #(* % %) digits))]
          :when (< e digits-squared)]
      e)))




