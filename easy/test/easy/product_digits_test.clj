(ns easy.product-digits-test
  (:require
    [clojure.test        :refer :all]
    [easy.product-digits :as pd]))

(deftest product-digits-test
  (is (= (pd/prod-dig 1 1) '(1)))
  (is (= (pd/prod-dig 99 9) '(8 9 1)))
  (is (= (pd/prod-dig 999 99) [9 8 9 0 1])))
