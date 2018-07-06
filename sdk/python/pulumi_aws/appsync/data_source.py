# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class DataSource(pulumi.CustomResource):
    """
    Provides an AppSync DataSource.
    """
    def __init__(__self__, __name__, __opts__=None, api_id=None, description=None, dynamodb_config=None, elasticsearch_config=None, lambda_config=None, name=None, service_role_arn=None, type=None):
        """Create a DataSource resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not api_id:
            raise TypeError('Missing required property api_id')
        elif not isinstance(api_id, basestring):
            raise TypeError('Expected property api_id to be a basestring')
        __self__.api_id = api_id
        """
        The API ID for the GraphQL API for the DataSource.
        """
        __props__['apiId'] = api_id

        if description and not isinstance(description, basestring):
            raise TypeError('Expected property description to be a basestring')
        __self__.description = description
        """
        A description of the DataSource.
        """
        __props__['description'] = description

        if dynamodb_config and not isinstance(dynamodb_config, dict):
            raise TypeError('Expected property dynamodb_config to be a dict')
        __self__.dynamodb_config = dynamodb_config
        """
        DynamoDB settings. See [below](#dynamodb_config)
        """
        __props__['dynamodbConfig'] = dynamodb_config

        if elasticsearch_config and not isinstance(elasticsearch_config, dict):
            raise TypeError('Expected property elasticsearch_config to be a dict')
        __self__.elasticsearch_config = elasticsearch_config
        """
        Amazon Elasticsearch settings. See [below](#elasticsearch_config)
        """
        __props__['elasticsearchConfig'] = elasticsearch_config

        if lambda_config and not isinstance(lambda_config, dict):
            raise TypeError('Expected property lambda_config to be a dict')
        __self__.lambda_config = lambda_config
        """
        AWS Lambda settings. See [below](#lambda_config)
        """
        __props__['lambdaConfig'] = lambda_config

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        A user-supplied name for the DataSource.
        """
        __props__['name'] = name

        if service_role_arn and not isinstance(service_role_arn, basestring):
            raise TypeError('Expected property service_role_arn to be a basestring')
        __self__.service_role_arn = service_role_arn
        """
        The IAM service role ARN for the data source.
        """
        __props__['serviceRoleArn'] = service_role_arn

        if not type:
            raise TypeError('Missing required property type')
        elif not isinstance(type, basestring):
            raise TypeError('Expected property type to be a basestring')
        __self__.type = type
        """
        The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB` and `AMAZON_ELASTICSEARCH`, `NONE`.
        """
        __props__['type'] = type

        __self__.arn = pulumi.runtime.UNKNOWN
        """
        The ARN
        """

        super(DataSource, __self__).__init__(
            'aws:appsync/dataSource:DataSource',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'apiId' in outs:
            self.api_id = outs['apiId']
        if 'arn' in outs:
            self.arn = outs['arn']
        if 'description' in outs:
            self.description = outs['description']
        if 'dynamodbConfig' in outs:
            self.dynamodb_config = outs['dynamodbConfig']
        if 'elasticsearchConfig' in outs:
            self.elasticsearch_config = outs['elasticsearchConfig']
        if 'lambdaConfig' in outs:
            self.lambda_config = outs['lambdaConfig']
        if 'name' in outs:
            self.name = outs['name']
        if 'serviceRoleArn' in outs:
            self.service_role_arn = outs['serviceRoleArn']
        if 'type' in outs:
            self.type = outs['type']