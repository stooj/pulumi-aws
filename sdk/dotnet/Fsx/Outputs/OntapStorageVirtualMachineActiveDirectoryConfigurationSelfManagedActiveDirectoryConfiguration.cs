// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Outputs
{

    [OutputType]
    public sealed class OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration
    {
        public readonly ImmutableArray<string> DnsIps;
        public readonly string DomainName;
        public readonly string? FileSystemAdministratorsGroup;
        public readonly string? OrganizationalUnitDistinguishedName;
        public readonly string Password;
        public readonly string Username;

        [OutputConstructor]
        private OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration(
            ImmutableArray<string> dnsIps,

            string domainName,

            string? fileSystemAdministratorsGroup,

            string? organizationalUnitDistinguishedName,

            string password,

            string username)
        {
            DnsIps = dnsIps;
            DomainName = domainName;
            FileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            OrganizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            Password = password;
            Username = username;
        }
    }
}
