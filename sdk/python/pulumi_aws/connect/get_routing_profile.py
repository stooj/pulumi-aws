# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetRoutingProfileResult',
    'AwaitableGetRoutingProfileResult',
    'get_routing_profile',
    'get_routing_profile_output',
]

@pulumi.output_type
class GetRoutingProfileResult:
    """
    A collection of values returned by getRoutingProfile.
    """
    def __init__(__self__, arn=None, default_outbound_queue_id=None, description=None, id=None, instance_id=None, media_concurrencies=None, name=None, queue_configs=None, routing_profile_id=None, tags=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if default_outbound_queue_id and not isinstance(default_outbound_queue_id, str):
            raise TypeError("Expected argument 'default_outbound_queue_id' to be a str")
        pulumi.set(__self__, "default_outbound_queue_id", default_outbound_queue_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if media_concurrencies and not isinstance(media_concurrencies, list):
            raise TypeError("Expected argument 'media_concurrencies' to be a list")
        pulumi.set(__self__, "media_concurrencies", media_concurrencies)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if queue_configs and not isinstance(queue_configs, list):
            raise TypeError("Expected argument 'queue_configs' to be a list")
        pulumi.set(__self__, "queue_configs", queue_configs)
        if routing_profile_id and not isinstance(routing_profile_id, str):
            raise TypeError("Expected argument 'routing_profile_id' to be a str")
        pulumi.set(__self__, "routing_profile_id", routing_profile_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The Amazon Resource Name (ARN) of the Routing Profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="defaultOutboundQueueId")
    def default_outbound_queue_id(self) -> str:
        """
        Specifies the default outbound queue for the Routing Profile.
        """
        return pulumi.get(self, "default_outbound_queue_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Specifies the description of the Routing Profile.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="mediaConcurrencies")
    def media_concurrencies(self) -> Sequence['outputs.GetRoutingProfileMediaConcurrencyResult']:
        """
        One or more `media_concurrencies` blocks that specify the channels that agents can handle in the Contact Control Panel (CCP) for this Routing Profile. The `media_concurrencies` block is documented below.
        """
        return pulumi.get(self, "media_concurrencies")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="queueConfigs")
    def queue_configs(self) -> Sequence['outputs.GetRoutingProfileQueueConfigResult']:
        """
        One or more `queue_configs` blocks that specify the inbound queues associated with the routing profile. If no queue is added, the agent only can make outbound calls. The `queue_configs` block is documented below.
        """
        return pulumi.get(self, "queue_configs")

    @property
    @pulumi.getter(name="routingProfileId")
    def routing_profile_id(self) -> str:
        return pulumi.get(self, "routing_profile_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A map of tags to assign to the Routing Profile.
        """
        return pulumi.get(self, "tags")


class AwaitableGetRoutingProfileResult(GetRoutingProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRoutingProfileResult(
            arn=self.arn,
            default_outbound_queue_id=self.default_outbound_queue_id,
            description=self.description,
            id=self.id,
            instance_id=self.instance_id,
            media_concurrencies=self.media_concurrencies,
            name=self.name,
            queue_configs=self.queue_configs,
            routing_profile_id=self.routing_profile_id,
            tags=self.tags)


def get_routing_profile(instance_id: Optional[str] = None,
                        name: Optional[str] = None,
                        routing_profile_id: Optional[str] = None,
                        tags: Optional[Mapping[str, str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRoutingProfileResult:
    """
    Provides details about a specific Amazon Connect Routing Profile.

    ## Example Usage

    By `name`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_routing_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Example")
    ```

    By `routing_profile_id`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_routing_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        routing_profile_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Routing Profile by name
    :param str routing_profile_id: Returns information on a specific Routing Profile by Routing Profile id
    :param Mapping[str, str] tags: A map of tags to assign to the Routing Profile.
    """
    __args__ = dict()
    __args__['instanceId'] = instance_id
    __args__['name'] = name
    __args__['routingProfileId'] = routing_profile_id
    __args__['tags'] = tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:connect/getRoutingProfile:getRoutingProfile', __args__, opts=opts, typ=GetRoutingProfileResult).value

    return AwaitableGetRoutingProfileResult(
        arn=__ret__.arn,
        default_outbound_queue_id=__ret__.default_outbound_queue_id,
        description=__ret__.description,
        id=__ret__.id,
        instance_id=__ret__.instance_id,
        media_concurrencies=__ret__.media_concurrencies,
        name=__ret__.name,
        queue_configs=__ret__.queue_configs,
        routing_profile_id=__ret__.routing_profile_id,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_routing_profile)
def get_routing_profile_output(instance_id: Optional[pulumi.Input[str]] = None,
                               name: Optional[pulumi.Input[Optional[str]]] = None,
                               routing_profile_id: Optional[pulumi.Input[Optional[str]]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRoutingProfileResult]:
    """
    Provides details about a specific Amazon Connect Routing Profile.

    ## Example Usage

    By `name`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_routing_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        name="Example")
    ```

    By `routing_profile_id`

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.connect.get_routing_profile(instance_id="aaaaaaaa-bbbb-cccc-dddd-111111111111",
        routing_profile_id="cccccccc-bbbb-cccc-dddd-111111111111")
    ```


    :param str instance_id: Reference to the hosting Amazon Connect Instance
    :param str name: Returns information on a specific Routing Profile by name
    :param str routing_profile_id: Returns information on a specific Routing Profile by Routing Profile id
    :param Mapping[str, str] tags: A map of tags to assign to the Routing Profile.
    """
    ...