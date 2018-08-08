package io.kloudformation.function

import io.kloudformation.Value

open class Reference<T>(val ref: String)
    :   Value<T>,
        Cidr.Value<T>,
        Att.Value<T>,
        Select.ObjectValue<T>,
        FindInMapValue<T>,
        GetAZs.Value<T>,
        ImportValue.Value<T>,
        SplitValue<T>,
        SubValue<T>,
        IfValue<T>,
        ConditionalValue<T>,
        EqualsValue