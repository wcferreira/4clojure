(ns easy.symmetric-difference-test
  (:require
            [clojure.test              :refer :all]
            [easy.symmetric-difference :as sd]
            [clojure.set]))

(def first-input  {:coll1 #{1 2 3 4 5 6} :coll2 #{1 3 5 7}     :expected #{2 4 6 7}})
(def second-input {:coll1 #{:a :b :c}    :coll2 #{}            :expected #{:a :b :c}})
(def third-input  {:coll1 #{}            :coll2 #{4 5 6}       :expected #{4 5 6}})
(def fourth-input {:coll1 #{[1 2] [2 3]} :coll2 #{[2 3] [3 4]} :expected #{[1 2] [3 4]}})

(deftest sym-diff-test
  (is (= (sd/sym-diff (:coll1 first-input) (:coll2 first-input)) (:expected first-input)))

  )




