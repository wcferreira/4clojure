(ns easy.half-true-test
  (:require
    [clojure.test   :refer :all]
    [easy.half-true :as ht]))


(deftest half-true-test
  (is (= false (ht/half-true? false false)))
  (is (= true  (ht/half-true? true false)))
  (is (= false (ht/half-true? true)))
  (is (= true  (ht/half-true? false true false)))
  (is (= false (ht/half-true? true true true)))
  (is (= true  (ht/half-true? true true true false))))
