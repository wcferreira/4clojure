(ns easy.indexing-sequences-test
  (:require
           [clojure.test            :refer :all]
           [easy.indexing-sequences :as is]))


(def first-input  {:coll [:a :b :c]           :expected [[:a 0] [:b 1] [:c 2]]})
(def second-input {:coll [0 1 3]              :expected '((0 0) (1 1) (3 2))})
(def third-input  {:coll [[:foo] {:bar :baz}] :expected [[[:foo] 0] [{:bar :baz} 1]]})

(deftest index-seq-test
  (is (= (is/index-seq (:coll first-input)) (:expected first-input)))
  (is (= (is/index-seq (:coll second-input)) (:expected second-input)))
  (is (= (is/index-seq (:coll third-input)) (:expected third-input))))