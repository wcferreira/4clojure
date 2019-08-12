(ns easy.create-map-test
  (:require
    [clojure.test           :refer :all]
    [easy.map-construction :as mc]))

(def first-input {:coll1 [:a :b :c]
                  :coll2 [1 2 3]})

(def second-input {:coll1 [1 2 3 4]
                   :coll2 ["one" "two" "three"]})

(def third-input {:coll1 [:foo :bar]
                  :coll2 ["foo" "bar" "baz"]})

(deftest create-map-test
  (is (= (mc/create-map (:coll1 first-input) (:coll2 first-input)) {:a 1, :b 2, :c 3}))
  (is (= (mc/create-map (:coll1 second-input) (:coll2 second-input)) {1 "one", 2 "two", 3 "three"}))
  (is (= (mc/create-map (:coll1 third-input) (:coll2 third-input)) {:foo "foo", :bar "bar"})))