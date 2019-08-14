(ns easy.sum-squared-digits-test
  (:require
           [clojure.test           :refer :all]
           [easy.sum-square-digits :as ssd]))


(deftest sum-square-digits-test
  (is (= (ssd/sum-squared-digits (range 10)) 8))
  (is (= (ssd/sum-squared-digits (range 30)) 19))
  (is (= (ssd/sum-squared-digits (range 100)) 50))
  (is (= (ssd/sum-squared-digits (range 1000)) 50)))
