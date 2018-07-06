# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class GetClusterResult(object):
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, allow_version_upgrade=None, automated_snapshot_retention_period=None, availability_zone=None, bucket_name=None, cluster_parameter_group_name=None, cluster_public_key=None, cluster_revision_number=None, cluster_security_groups=None, cluster_subnet_group_name=None, cluster_type=None, cluster_version=None, database_name=None, elastic_ip=None, enable_logging=None, encrypted=None, endpoint=None, enhanced_vpc_routing=None, iam_roles=None, kms_key_id=None, master_username=None, node_type=None, number_of_nodes=None, port=None, preferred_maintenance_window=None, publicly_accessible=None, s3_key_prefix=None, vpc_id=None, vpc_security_group_ids=None, id=None):
        if allow_version_upgrade and not isinstance(allow_version_upgrade, bool):
            raise TypeError('Expected argument allow_version_upgrade to be a bool')
        __self__.allow_version_upgrade = allow_version_upgrade
        """
        Whether major version upgrades can be applied during maintenance period
        """
        if automated_snapshot_retention_period and not isinstance(automated_snapshot_retention_period, int):
            raise TypeError('Expected argument automated_snapshot_retention_period to be a int')
        __self__.automated_snapshot_retention_period = automated_snapshot_retention_period
        """
        The backup retention period
        """
        if availability_zone and not isinstance(availability_zone, basestring):
            raise TypeError('Expected argument availability_zone to be a basestring')
        __self__.availability_zone = availability_zone
        """
        The availability zone of the cluster
        """
        if bucket_name and not isinstance(bucket_name, basestring):
            raise TypeError('Expected argument bucket_name to be a basestring')
        __self__.bucket_name = bucket_name
        """
        The name of the S3 bucket where the log files are to be stored
        """
        if cluster_parameter_group_name and not isinstance(cluster_parameter_group_name, basestring):
            raise TypeError('Expected argument cluster_parameter_group_name to be a basestring')
        __self__.cluster_parameter_group_name = cluster_parameter_group_name
        """
        The name of the parameter group to be associated with this cluster
        """
        if cluster_public_key and not isinstance(cluster_public_key, basestring):
            raise TypeError('Expected argument cluster_public_key to be a basestring')
        __self__.cluster_public_key = cluster_public_key
        """
        The public key for the cluster
        """
        if cluster_revision_number and not isinstance(cluster_revision_number, basestring):
            raise TypeError('Expected argument cluster_revision_number to be a basestring')
        __self__.cluster_revision_number = cluster_revision_number
        """
        The cluster revision number
        """
        if cluster_security_groups and not isinstance(cluster_security_groups, list):
            raise TypeError('Expected argument cluster_security_groups to be a list')
        __self__.cluster_security_groups = cluster_security_groups
        """
        The security groups associated with the cluster
        """
        if cluster_subnet_group_name and not isinstance(cluster_subnet_group_name, basestring):
            raise TypeError('Expected argument cluster_subnet_group_name to be a basestring')
        __self__.cluster_subnet_group_name = cluster_subnet_group_name
        """
        The name of a cluster subnet group to be associated with this cluster
        """
        if cluster_type and not isinstance(cluster_type, basestring):
            raise TypeError('Expected argument cluster_type to be a basestring')
        __self__.cluster_type = cluster_type
        """
        The cluster type
        """
        if cluster_version and not isinstance(cluster_version, basestring):
            raise TypeError('Expected argument cluster_version to be a basestring')
        __self__.cluster_version = cluster_version
        if database_name and not isinstance(database_name, basestring):
            raise TypeError('Expected argument database_name to be a basestring')
        __self__.database_name = database_name
        """
        The name of the default database in the cluster
        """
        if elastic_ip and not isinstance(elastic_ip, basestring):
            raise TypeError('Expected argument elastic_ip to be a basestring')
        __self__.elastic_ip = elastic_ip
        """
        The Elastic IP of the cluster
        """
        if enable_logging and not isinstance(enable_logging, bool):
            raise TypeError('Expected argument enable_logging to be a bool')
        __self__.enable_logging = enable_logging
        """
        Whether cluster logging is enabled
        """
        if encrypted and not isinstance(encrypted, bool):
            raise TypeError('Expected argument encrypted to be a bool')
        __self__.encrypted = encrypted
        """
        Whether the cluster data is encrypted
        """
        if endpoint and not isinstance(endpoint, basestring):
            raise TypeError('Expected argument endpoint to be a basestring')
        __self__.endpoint = endpoint
        """
        The cluster endpoint
        """
        if enhanced_vpc_routing and not isinstance(enhanced_vpc_routing, bool):
            raise TypeError('Expected argument enhanced_vpc_routing to be a bool')
        __self__.enhanced_vpc_routing = enhanced_vpc_routing
        """
        Whether enhanced VPC routing is enabled
        """
        if iam_roles and not isinstance(iam_roles, list):
            raise TypeError('Expected argument iam_roles to be a list')
        __self__.iam_roles = iam_roles
        """
        The IAM roles associated to the cluster
        """
        if kms_key_id and not isinstance(kms_key_id, basestring):
            raise TypeError('Expected argument kms_key_id to be a basestring')
        __self__.kms_key_id = kms_key_id
        """
        The KMS encryption key associated to the cluster
        """
        if master_username and not isinstance(master_username, basestring):
            raise TypeError('Expected argument master_username to be a basestring')
        __self__.master_username = master_username
        """
        Username for the master DB user
        """
        if node_type and not isinstance(node_type, basestring):
            raise TypeError('Expected argument node_type to be a basestring')
        __self__.node_type = node_type
        """
        The cluster node type
        """
        if number_of_nodes and not isinstance(number_of_nodes, int):
            raise TypeError('Expected argument number_of_nodes to be a int')
        __self__.number_of_nodes = number_of_nodes
        """
        The number of nodes in the cluster
        """
        if port and not isinstance(port, int):
            raise TypeError('Expected argument port to be a int')
        __self__.port = port
        """
        The port the cluster responds on
        """
        if preferred_maintenance_window and not isinstance(preferred_maintenance_window, basestring):
            raise TypeError('Expected argument preferred_maintenance_window to be a basestring')
        __self__.preferred_maintenance_window = preferred_maintenance_window
        """
        The maintenance window
        """
        if publicly_accessible and not isinstance(publicly_accessible, bool):
            raise TypeError('Expected argument publicly_accessible to be a bool')
        __self__.publicly_accessible = publicly_accessible
        """
        Whether the cluster is publicly accessible
        """
        if s3_key_prefix and not isinstance(s3_key_prefix, basestring):
            raise TypeError('Expected argument s3_key_prefix to be a basestring')
        __self__.s3_key_prefix = s3_key_prefix
        """
        The folder inside the S3 bucket where the log files are stored
        """
        if vpc_id and not isinstance(vpc_id, basestring):
            raise TypeError('Expected argument vpc_id to be a basestring')
        __self__.vpc_id = vpc_id
        """
        The VPC Id associated with the cluster
        """
        if vpc_security_group_ids and not isinstance(vpc_security_group_ids, list):
            raise TypeError('Expected argument vpc_security_group_ids to be a list')
        __self__.vpc_security_group_ids = vpc_security_group_ids
        """
        The VPC security group Ids associated with the cluster
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_cluster(cluster_identifier=None, tags=None):
    """
    Provides details about a specific redshift cluster.
    """
    __args__ = dict()

    __args__['clusterIdentifier'] = cluster_identifier
    __args__['tags'] = tags
    __ret__ = pulumi.runtime.invoke('aws:redshift/getCluster:getCluster', __args__)

    return GetClusterResult(
        allow_version_upgrade=__ret__.get('allowVersionUpgrade'),
        automated_snapshot_retention_period=__ret__.get('automatedSnapshotRetentionPeriod'),
        availability_zone=__ret__.get('availabilityZone'),
        bucket_name=__ret__.get('bucketName'),
        cluster_parameter_group_name=__ret__.get('clusterParameterGroupName'),
        cluster_public_key=__ret__.get('clusterPublicKey'),
        cluster_revision_number=__ret__.get('clusterRevisionNumber'),
        cluster_security_groups=__ret__.get('clusterSecurityGroups'),
        cluster_subnet_group_name=__ret__.get('clusterSubnetGroupName'),
        cluster_type=__ret__.get('clusterType'),
        cluster_version=__ret__.get('clusterVersion'),
        database_name=__ret__.get('databaseName'),
        elastic_ip=__ret__.get('elasticIp'),
        enable_logging=__ret__.get('enableLogging'),
        encrypted=__ret__.get('encrypted'),
        endpoint=__ret__.get('endpoint'),
        enhanced_vpc_routing=__ret__.get('enhancedVpcRouting'),
        iam_roles=__ret__.get('iamRoles'),
        kms_key_id=__ret__.get('kmsKeyId'),
        master_username=__ret__.get('masterUsername'),
        node_type=__ret__.get('nodeType'),
        number_of_nodes=__ret__.get('numberOfNodes'),
        port=__ret__.get('port'),
        preferred_maintenance_window=__ret__.get('preferredMaintenanceWindow'),
        publicly_accessible=__ret__.get('publiclyAccessible'),
        s3_key_prefix=__ret__.get('s3KeyPrefix'),
        vpc_id=__ret__.get('vpcId'),
        vpc_security_group_ids=__ret__.get('vpcSecurityGroupIds'),
        id=__ret__.get('id'))