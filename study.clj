(defn merge-one-pair [[{name :name, rate :rate, group :group} units]]
    "returns total calories for n units of the foodstuff"
    (let [cals (reduce * [rate units]), pair [name cals]]
        pair))

(defn merge-many-pairs [& more]
    "returns total calories for many foodstuff rations"
    (map merge-one-pair more))

(defn logger [& more]
    "creates user-friendly output"
    (let [total (reduce + (map last more)), foodstuffs (map merge-one-pair more)]
        (println "\n" 
            "foodstuffs:" foodstuffs "\n" 
            "total:" total "cals." "\n")))

(def oj
    {:name "Kirkland orange juice"
    :rate 0.5
    :group 'fruit})

(def acai
    {:name "acai drink"
    :rate 100
    :group 'fruit})