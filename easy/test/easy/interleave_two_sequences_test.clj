(ns easy.interleave-two-sequences-test
  (:require
    [clojure.test                  :refer :all]
    [easy.interleave-two-sequences :as its]))


(deftest interleave-sequences-test
  (is (= (its/my-interleave [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
  (is (= (its/my-interleave [1 2] [3 4 5 6]) '(1 3 2 4)))
  (is (= (its/my-interleave [1 2 3 4] [5]) [1 5]))
  (is (= (its/my-interleave [30 20] [25 15]) [30 25 20 15]))
  )
