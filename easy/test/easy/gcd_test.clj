(ns easy.gcd-test
  (:require
           [clojure.test :refer :all]
           [easy.gcd     :as gcd]))

;;          (= (__ 2 4) 2)
;;          (= (__ 10 5) 5)
;;          (= (__ 5 7) 1)
;;          (= (__ 1023 858) 33)

(def first-input  {:num1 2    :num2 4   :expected 2})
(def second-input {:num1 10   :num2 5   :expected 5})
(def third-input  {:num1 5    :num2 7   :expected 1})
(def fourth-input {:num1 1023 :num2 858 :expected 33})


(deftest gcd-test
  (is (= (gcd/gcd (:num1 first-input) (:num2 first-input)) (:expected first-input)))
  (is (= (gcd/gcd (:num1 second-input) (:num2 second-input)) (:expected second-input)))
  (is (= (gcd/gcd (:num1 third-input) (:num2 third-input)) (:expected third-input)))
  (is (= (gcd/gcd (:num1 fourth-input) (:num2 fourth-input)) (:expected fourth-input))))
