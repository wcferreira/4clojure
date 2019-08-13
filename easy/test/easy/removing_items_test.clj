(ns easy.removing-items-test
  (:require
    [clojure.test        :refer :all]
    [easy.removing-items :as ri]))

(def first-input  {:coll [1 2 3 4 5 6 7 8]   :offset 3 :expected [1 2 4 5 7 8]})
(def second-input {:coll [:a :b :c :d :e :f] :offset 2 :expected [:a :c :e]})
(def third-input  {:coll [1 2 3 4 5 6]       :offset 4 :expected [1 2 3 5 6]})

(deftest removing-items-test
  (is (= (ri/drop-every-nth (:coll first-input) (:offset first-input)) (:expected first-input)))
  (is (= (ri/drop-every-nth (:coll second-input) (:offset second-input)) (:expected second-input)))
  (is (= (ri/drop-every-nth (:coll third-input) (:offset third-input)) (:expected third-input))))
