(ns easy.duplicate-sequence-test
  (:require
    [clojure.test            :refer :all]
    [easy.duplicate-sequence :as ds]))


(deftest duplicate-sequence
  (testing "Duplicating a sequence"
    (is (= (ds/duplicate-sequence [1 2 3]) [1 1 2 2 3 3])))
    (is (= (ds/duplicate-sequence [:a :a :b :b]) [:a :a :a :a :b :b :b :b]))
    (is (= (ds/duplicate-sequence [[1 2] [3 4]]) [[1 2] [1 2] [3 4] [3 4]]))
    (is (= (ds/duplicate-sequence [[1 2] [3 4]]) [[1 2] [1 2] [3 4] [3 4]])))
