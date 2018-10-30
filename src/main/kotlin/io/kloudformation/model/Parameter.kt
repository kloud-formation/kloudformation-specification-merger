package io.kloudformation.model

import com.fasterxml.jackson.annotation.JsonIgnore
import io.kloudformation.KloudResource

data class Parameter<T>(
        @JsonIgnore override val logicalName: String,
        val type: String,
        val allowedPattern: String? = null,
        val allowedValues: List<String>? = null,
        val constraintDescription: String? = null,
        val default: String? = null,
        val description: String? = null,
        val maxLength: String? = null,
        val maxValue: String? = null,
        val minLength: String? = null,
        val minValue: String? = null,
        val noEcho: String? = null
): KloudResource<T>(logicalName, type)

sealed class ParameterType<T>(val type: String){
    object StringParameter: ParameterType<String>("String")
    object NumberParameter: ParameterType<String>("Number")
    object NumberListParameter: ParameterType<List<String>>("List<Number>")
    object CommaDelimitedListParameter: ParameterType<List<String>>("CommaDelimitedList")
    object AvailabilityZoneParameter: ParameterType<String>("AWS::EC2::AvailabilityZone::Name")
    object ImageIdParameter: ParameterType<String>("AWS::EC2::Image::Id")
    object InstanceIdParameter: ParameterType<String>("AWS::EC2::Instance::Id")
    object KeyPairNameParameter: ParameterType<String>("AWS::EC2::KeyPair::KeyName")
    object SecurityGroupNameParameter: ParameterType<String>("AWS::EC2::SecurityGroup::GroupName")
    object SecurityGroupIdParameter: ParameterType<String>("AWS::EC2::SecurityGroup::Id")
    object SubnetIdParameter: ParameterType<String>("AWS::EC2::Subnet::Id")
    object VolumeIdParameter: ParameterType<String>("AWS::EC2::Volume::Id")
    object VpcIdParameter: ParameterType<String>("AWS::EC2::VPC::Id")
    object HostedZoneIdParameter: ParameterType<String>("AWS::Route53::HostedZone::Id")

    object AvailabilityZoneListParameter: ParameterType<List<String>>("List<AWS::EC2::AvailabilityZone::Name>")
    object ImageIdListParameter: ParameterType<List<String>>("List<AWS::EC2::Image::Id>")
    object InstanceIdListParameter: ParameterType<List<String>>("List<AWS::EC2::Instance::Id>")
    object KeyPairNameListParameter: ParameterType<List<String>>("List<AWS::EC2::KeyPair::KeyName>")
    object SecurityGroupNameListParameter: ParameterType<List<String>>("List<AWS::EC2::SecurityGroup::GroupName>")
    object SecurityGroupIdListParameter: ParameterType<List<String>>("List<AWS::EC2::SecurityGroup::Id>")
    object SubnetIdListParameter: ParameterType<List<String>>("List<AWS::EC2::Subnet::Id>")
    object VolumeIdListParameter: ParameterType<List<String>>("List<AWS::EC2::Volume::Id>")
    object VpcIdListParameter: ParameterType<List<String>>("List<AWS::EC2::VPC::Id>")
    object HostedZoneIdListParameter: ParameterType<List<String>>("List<AWS::Route53::HostedZone::Id>")
}