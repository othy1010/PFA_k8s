/**
 */
package k8s;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see k8s.K8sPackage#getKind()
 * @model
 * @generated
 */
public enum Kind implements Enumerator {
	/**
	 * The '<em><b>Certificate Signing Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_SIGNING_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATE_SIGNING_REQUEST(0, "CertificateSigningRequest", "CertificateSigningRequest"),

	/**
	 * The '<em><b>Cluster Role Binding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ROLE_BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_ROLE_BINDING(1, "ClusterRoleBinding", "ClusterRoleBinding"),

	/**
	 * The '<em><b>Cluster Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_ROLE(2, "ClusterRole", "ClusterRole"),

	/**
	 * The '<em><b>Component Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_STATUS(3, "ComponentStatus", "ComponentStatus"),

	/**
	 * The '<em><b>Config Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIG_MAP(4, "ConfigMap", "ConfigMap"),

	/**
	 * The '<em><b>Controller Revision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_REVISION_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER_REVISION(5, "ControllerRevision", "ControllerRevision"),

	/**
	 * The '<em><b>Cron Job</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRON_JOB_VALUE
	 * @generated
	 * @ordered
	 */
	CRON_JOB(6, "CronJob", "CronJob"),

	/**
	 * The '<em><b>Daemon Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAEMON_SET_VALUE
	 * @generated
	 * @ordered
	 */
	DAEMON_SET(7, "DaemonSet", "DaemonSet"),

	/**
	 * The '<em><b>Deployment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT(8, "Deployment", "Deployment"),

	/**
	 * The '<em><b>Endpoints</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINTS(9, "Endpoints", "Endpoints"),

	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(10, "Event", "Event"),

	/**
	 * The '<em><b>Horizontal Pod Autoscaler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_POD_AUTOSCALER_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL_POD_AUTOSCALER(11, "HorizontalPodAutoscaler", "HorizontalPodAutoscaler"),

	/**
	 * The '<em><b>Ingress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	INGRESS(12, "Ingress", "Ingress"),

	/**
	 * The '<em><b>Job</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_VALUE
	 * @generated
	 * @ordered
	 */
	JOB(13, "Job", "Job"),

	/**
	 * The '<em><b>Limit Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	LIMIT_RANGE(14, "LimitRange", "LimitRange"),

	/**
	 * The '<em><b>Namespace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMESPACE_VALUE
	 * @generated
	 * @ordered
	 */
	NAMESPACE(15, "Namespace", "Namespace"),

	/**
	 * The '<em><b>Network Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_POLICY(16, "NetworkPolicy", "NetworkPolicy"),

	/**
	 * The '<em><b>Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_VALUE
	 * @generated
	 * @ordered
	 */
	NODE(17, "Node", "Node"),

	/**
	 * The '<em><b>Persistent Volume Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME_CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENT_VOLUME_CLAIM(18, "PersistentVolumeClaim", "PersistentVolumeClaim"),

	/**
	 * The '<em><b>Persistent Volume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENT_VOLUME(19, "PersistentVolume", "PersistentVolume"),

	/**
	 * The '<em><b>Pod Disruption Budget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_DISRUPTION_BUDGET_VALUE
	 * @generated
	 * @ordered
	 */
	POD_DISRUPTION_BUDGET(20, "PodDisruptionBudget", "PodDisruptionBudget"),

	/**
	 * The '<em><b>Pod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_VALUE
	 * @generated
	 * @ordered
	 */
	POD(21, "Pod", "Pod"),

	/**
	 * The '<em><b>Pod Security Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_SECURITY_POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	POD_SECURITY_POLICY(22, "PodSecurityPolicy", "PodSecurityPolicy"),

	/**
	 * The '<em><b>Pod Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	POD_TEMPLATE(23, "PodTemplate", "PodTemplate"),

	/**
	 * The '<em><b>Replica Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICA_SET_VALUE
	 * @generated
	 * @ordered
	 */
	REPLICA_SET(24, "ReplicaSet", "ReplicaSet"),

	/**
	 * The '<em><b>Replication Controller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICATION_CONTROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	REPLICATION_CONTROLLER(25, "ReplicationController", "ReplicationController"),

	/**
	 * The '<em><b>Resource Quota</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_QUOTA_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_QUOTA(26, "ResourceQuota", "ResourceQuota"),

	/**
	 * The '<em><b>Role Binding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_BINDING_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_BINDING(27, "RoleBinding", "RoleBinding"),

	/**
	 * The '<em><b>Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE(28, "Role", "Role"),

	/**
	 * The '<em><b>Secret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET_VALUE
	 * @generated
	 * @ordered
	 */
	SECRET(29, "Secret", "Secret"),

	/**
	 * The '<em><b>Service Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ACCOUNT(30, "ServiceAccount", "ServiceAccount"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(31, "Service", "Service"),

	/**
	 * The '<em><b>Stateful Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEFUL_SET_VALUE
	 * @generated
	 * @ordered
	 */
	STATEFUL_SET(32, "StatefulSet", "StatefulSet");

	/**
	 * The '<em><b>Certificate Signing Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATE_SIGNING_REQUEST
	 * @model name="CertificateSigningRequest"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATE_SIGNING_REQUEST_VALUE = 0;

	/**
	 * The '<em><b>Cluster Role Binding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ROLE_BINDING
	 * @model name="ClusterRoleBinding"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_ROLE_BINDING_VALUE = 1;

	/**
	 * The '<em><b>Cluster Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_ROLE
	 * @model name="ClusterRole"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_ROLE_VALUE = 2;

	/**
	 * The '<em><b>Component Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_STATUS
	 * @model name="ComponentStatus"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_STATUS_VALUE = 3;

	/**
	 * The '<em><b>Config Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_MAP
	 * @model name="ConfigMap"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIG_MAP_VALUE = 4;

	/**
	 * The '<em><b>Controller Revision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_REVISION
	 * @model name="ControllerRevision"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_REVISION_VALUE = 5;

	/**
	 * The '<em><b>Cron Job</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRON_JOB
	 * @model name="CronJob"
	 * @generated
	 * @ordered
	 */
	public static final int CRON_JOB_VALUE = 6;

	/**
	 * The '<em><b>Daemon Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAEMON_SET
	 * @model name="DaemonSet"
	 * @generated
	 * @ordered
	 */
	public static final int DAEMON_SET_VALUE = 7;

	/**
	 * The '<em><b>Deployment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT
	 * @model name="Deployment"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_VALUE = 8;

	/**
	 * The '<em><b>Endpoints</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDPOINTS
	 * @model name="Endpoints"
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINTS_VALUE = 9;

	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="Event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 10;

	/**
	 * The '<em><b>Horizontal Pod Autoscaler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_POD_AUTOSCALER
	 * @model name="HorizontalPodAutoscaler"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_POD_AUTOSCALER_VALUE = 11;

	/**
	 * The '<em><b>Ingress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS
	 * @model name="Ingress"
	 * @generated
	 * @ordered
	 */
	public static final int INGRESS_VALUE = 12;

	/**
	 * The '<em><b>Job</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB
	 * @model name="Job"
	 * @generated
	 * @ordered
	 */
	public static final int JOB_VALUE = 13;

	/**
	 * The '<em><b>Limit Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_RANGE
	 * @model name="LimitRange"
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_RANGE_VALUE = 14;

	/**
	 * The '<em><b>Namespace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMESPACE
	 * @model name="Namespace"
	 * @generated
	 * @ordered
	 */
	public static final int NAMESPACE_VALUE = 15;

	/**
	 * The '<em><b>Network Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_POLICY
	 * @model name="NetworkPolicy"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_POLICY_VALUE = 16;

	/**
	 * The '<em><b>Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE
	 * @model name="Node"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_VALUE = 17;

	/**
	 * The '<em><b>Persistent Volume Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME_CLAIM
	 * @model name="PersistentVolumeClaim"
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENT_VOLUME_CLAIM_VALUE = 18;

	/**
	 * The '<em><b>Persistent Volume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VOLUME
	 * @model name="PersistentVolume"
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENT_VOLUME_VALUE = 19;

	/**
	 * The '<em><b>Pod Disruption Budget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_DISRUPTION_BUDGET
	 * @model name="PodDisruptionBudget"
	 * @generated
	 * @ordered
	 */
	public static final int POD_DISRUPTION_BUDGET_VALUE = 20;

	/**
	 * The '<em><b>Pod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD
	 * @model name="Pod"
	 * @generated
	 * @ordered
	 */
	public static final int POD_VALUE = 21;

	/**
	 * The '<em><b>Pod Security Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_SECURITY_POLICY
	 * @model name="PodSecurityPolicy"
	 * @generated
	 * @ordered
	 */
	public static final int POD_SECURITY_POLICY_VALUE = 22;

	/**
	 * The '<em><b>Pod Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_TEMPLATE
	 * @model name="PodTemplate"
	 * @generated
	 * @ordered
	 */
	public static final int POD_TEMPLATE_VALUE = 23;

	/**
	 * The '<em><b>Replica Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICA_SET
	 * @model name="ReplicaSet"
	 * @generated
	 * @ordered
	 */
	public static final int REPLICA_SET_VALUE = 24;

	/**
	 * The '<em><b>Replication Controller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICATION_CONTROLLER
	 * @model name="ReplicationController"
	 * @generated
	 * @ordered
	 */
	public static final int REPLICATION_CONTROLLER_VALUE = 25;

	/**
	 * The '<em><b>Resource Quota</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_QUOTA
	 * @model name="ResourceQuota"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_QUOTA_VALUE = 26;

	/**
	 * The '<em><b>Role Binding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_BINDING
	 * @model name="RoleBinding"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_BINDING_VALUE = 27;

	/**
	 * The '<em><b>Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE
	 * @model name="Role"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_VALUE = 28;

	/**
	 * The '<em><b>Secret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECRET
	 * @model name="Secret"
	 * @generated
	 * @ordered
	 */
	public static final int SECRET_VALUE = 29;

	/**
	 * The '<em><b>Service Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ACCOUNT
	 * @model name="ServiceAccount"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ACCOUNT_VALUE = 30;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model name="Service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 31;

	/**
	 * The '<em><b>Stateful Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEFUL_SET
	 * @model name="StatefulSet"
	 * @generated
	 * @ordered
	 */
	public static final int STATEFUL_SET_VALUE = 32;

	/**
	 * An array of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kind[] VALUES_ARRAY =
		new Kind[] {
			CERTIFICATE_SIGNING_REQUEST,
			CLUSTER_ROLE_BINDING,
			CLUSTER_ROLE,
			COMPONENT_STATUS,
			CONFIG_MAP,
			CONTROLLER_REVISION,
			CRON_JOB,
			DAEMON_SET,
			DEPLOYMENT,
			ENDPOINTS,
			EVENT,
			HORIZONTAL_POD_AUTOSCALER,
			INGRESS,
			JOB,
			LIMIT_RANGE,
			NAMESPACE,
			NETWORK_POLICY,
			NODE,
			PERSISTENT_VOLUME_CLAIM,
			PERSISTENT_VOLUME,
			POD_DISRUPTION_BUDGET,
			POD,
			POD_SECURITY_POLICY,
			POD_TEMPLATE,
			REPLICA_SET,
			REPLICATION_CONTROLLER,
			RESOURCE_QUOTA,
			ROLE_BINDING,
			ROLE,
			SECRET,
			SERVICE_ACCOUNT,
			SERVICE,
			STATEFUL_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Kind get(int value) {
		switch (value) {
			case CERTIFICATE_SIGNING_REQUEST_VALUE: return CERTIFICATE_SIGNING_REQUEST;
			case CLUSTER_ROLE_BINDING_VALUE: return CLUSTER_ROLE_BINDING;
			case CLUSTER_ROLE_VALUE: return CLUSTER_ROLE;
			case COMPONENT_STATUS_VALUE: return COMPONENT_STATUS;
			case CONFIG_MAP_VALUE: return CONFIG_MAP;
			case CONTROLLER_REVISION_VALUE: return CONTROLLER_REVISION;
			case CRON_JOB_VALUE: return CRON_JOB;
			case DAEMON_SET_VALUE: return DAEMON_SET;
			case DEPLOYMENT_VALUE: return DEPLOYMENT;
			case ENDPOINTS_VALUE: return ENDPOINTS;
			case EVENT_VALUE: return EVENT;
			case HORIZONTAL_POD_AUTOSCALER_VALUE: return HORIZONTAL_POD_AUTOSCALER;
			case INGRESS_VALUE: return INGRESS;
			case JOB_VALUE: return JOB;
			case LIMIT_RANGE_VALUE: return LIMIT_RANGE;
			case NAMESPACE_VALUE: return NAMESPACE;
			case NETWORK_POLICY_VALUE: return NETWORK_POLICY;
			case NODE_VALUE: return NODE;
			case PERSISTENT_VOLUME_CLAIM_VALUE: return PERSISTENT_VOLUME_CLAIM;
			case PERSISTENT_VOLUME_VALUE: return PERSISTENT_VOLUME;
			case POD_DISRUPTION_BUDGET_VALUE: return POD_DISRUPTION_BUDGET;
			case POD_VALUE: return POD;
			case POD_SECURITY_POLICY_VALUE: return POD_SECURITY_POLICY;
			case POD_TEMPLATE_VALUE: return POD_TEMPLATE;
			case REPLICA_SET_VALUE: return REPLICA_SET;
			case REPLICATION_CONTROLLER_VALUE: return REPLICATION_CONTROLLER;
			case RESOURCE_QUOTA_VALUE: return RESOURCE_QUOTA;
			case ROLE_BINDING_VALUE: return ROLE_BINDING;
			case ROLE_VALUE: return ROLE;
			case SECRET_VALUE: return SECRET;
			case SERVICE_ACCOUNT_VALUE: return SERVICE_ACCOUNT;
			case SERVICE_VALUE: return SERVICE;
			case STATEFUL_SET_VALUE: return STATEFUL_SET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Kind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Kind
