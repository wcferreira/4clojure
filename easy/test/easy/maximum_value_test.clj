(ns easy.maximum-value-test
  (:require
    [clojure.test :refer :all]
    [easy.maximum-value  :as maxv]))

(deftest maximum-value-test
  (is (= (maxv/get-max-val 1 8 3 4) 8))
  (is (= (maxv/get-max-val 30 20) 30))
  (is (= (maxv/get-max-val 45 67 11) 67))
  (is (= (maxv/get-max-val2 1 8 3 4) 8))
  (is (= (maxv/get-max-val2 30 20) 30))
  (is (= (maxv/get-max-val2 45 67 11) 67)))
