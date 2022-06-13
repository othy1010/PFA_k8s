/**
 */
package k8s;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see k8s.K8sFactory
 * @model kind="package"
 * @generated
 */
public interface K8sPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "k8s";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://k8s.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "k8s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	K8sPackage eINSTANCE = k8s.impl.K8sPackageImpl.init();

	/**
	 * The meta object id for the '{@link k8s.impl.ManifestImpl <em>Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ManifestImpl
	 * @see k8s.impl.K8sPackageImpl#getManifest()
	 * @generated
	 */
	int MANIFEST = 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__KIND = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__SPEC = 3;

	/**
	 * The number of structural features of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.MetadataImpl
	 * @see k8s.impl.K8sPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LABELS = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANNOTATIONS = 3;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.Spec <em>Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.Spec
	 * @see k8s.impl.K8sPackageImpl#getSpec()
	 * @generated
	 */
	int SPEC = 2;

	/**
	 * The number of structural features of the '<em>Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.PodSpecImpl <em>Pod Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.PodSpecImpl
	 * @see k8s.impl.K8sPackageImpl#getPodSpec()
	 * @generated
	 */
	int POD_SPEC = 3;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__RESTART_POLICY = SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__AFFINITY = SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__CONTAINERS = SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__VOLUMES = SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Topology Spread Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS = SPEC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Init Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC__INIT_CONTAINERS = SPEC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pod Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Pod Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_SPEC_OPERATION_COUNT = SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link k8s.impl.DeploymentSpecImpl <em>Deployment Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.DeploymentSpecImpl
	 * @see k8s.impl.K8sPackageImpl#getDeploymentSpec()
	 * @generated
	 */
	int DEPLOYMENT_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPEC__SELECTOR = SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPEC__STRATEGY = SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPEC__TEMPLATE = SPEC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPEC_FEATURE_COUNT = SPEC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deployment Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_SPEC_OPERATION_COUNT = SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link k8s.impl.DeploymentStrategyImpl <em>Deployment Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.DeploymentStrategyImpl
	 * @see k8s.impl.K8sPackageImpl#getDeploymentStrategy()
	 * @generated
	 */
	int DEPLOYMENT_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STRATEGY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rolling Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STRATEGY__ROLLING_UPDATE = 1;

	/**
	 * The number of structural features of the '<em>Deployment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.SelectorImpl
	 * @see k8s.impl.K8sPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 6;

	/**
	 * The feature id for the '<em><b>Match Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__MATCH_EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Match Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__MATCH_LABELS = 1;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.PodTemplateImpl <em>Pod Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.PodTemplateImpl
	 * @see k8s.impl.K8sPackageImpl#getPodTemplate()
	 * @generated
	 */
	int POD_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE__SPEC = 1;

	/**
	 * The number of structural features of the '<em>Pod Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pod Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.TopologySpreadConstraintImpl <em>Topology Spread Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.TopologySpreadConstraintImpl
	 * @see k8s.impl.K8sPackageImpl#getTopologySpreadConstraint()
	 * @generated
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Label Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Topology Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY = 1;

	/**
	 * The feature id for the '<em><b>When Unsatisfiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Max Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW = 3;

	/**
	 * The number of structural features of the '<em>Topology Spread Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Topology Spread Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_SPREAD_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ContainersImpl <em>Containers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ContainersImpl
	 * @see k8s.impl.K8sPackageImpl#getContainers()
	 * @generated
	 */
	int CONTAINERS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Live Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__LIVE_RESTART = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__ARGS = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Liveness Probe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__LIVENESS_PROBE = 6;

	/**
	 * The feature id for the '<em><b>Readiness Probe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__READINESS_PROBE = 7;

	/**
	 * The feature id for the '<em><b>Life Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__LIFE_CYCLE = 8;

	/**
	 * The feature id for the '<em><b>Volume Mounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__VOLUME_MOUNTS = 9;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__ENV = 10;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__PORTS = 11;

	/**
	 * The number of structural features of the '<em>Containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.VolumeImpl
	 * @see k8s.impl.K8sPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__HOST_PATH = 1;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.AffinityImpl <em>Affinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.AffinityImpl
	 * @see k8s.impl.K8sPackageImpl#getAffinity()
	 * @generated
	 */
	int AFFINITY = 11;

	/**
	 * The feature id for the '<em><b>Node Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY__NODE_AFFINITY = 0;

	/**
	 * The number of structural features of the '<em>Affinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Affinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFINITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.RollingUpdateDeploymentImpl <em>Rolling Update Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.RollingUpdateDeploymentImpl
	 * @see k8s.impl.K8sPackageImpl#getRollingUpdateDeployment()
	 * @generated
	 */
	int ROLLING_UPDATE_DEPLOYMENT = 12;

	/**
	 * The feature id for the '<em><b>Max Unavailable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE = 0;

	/**
	 * The feature id for the '<em><b>Max Surge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE = 1;

	/**
	 * The number of structural features of the '<em>Rolling Update Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLING_UPDATE_DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rolling Update Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLING_UPDATE_DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.LabelSelectorImpl <em>Label Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.LabelSelectorImpl
	 * @see k8s.impl.K8sPackageImpl#getLabelSelector()
	 * @generated
	 */
	int LABEL_SELECTOR = 13;

	/**
	 * The feature id for the '<em><b>Match Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR__MATCH_EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Match Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR__MATCH_LABELS = 1;

	/**
	 * The number of structural features of the '<em>Label Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Label Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.MatchExpressionsImpl <em>Match Expressions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.MatchExpressionsImpl
	 * @see k8s.impl.K8sPackageImpl#getMatchExpressions()
	 * @generated
	 */
	int MATCH_EXPRESSIONS = 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSIONS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSIONS__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSIONS__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Match Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match Expressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ContainerPortImpl <em>Container Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ContainerPortImpl
	 * @see k8s.impl.K8sPackageImpl#getContainerPort()
	 * @generated
	 */
	int CONTAINER_PORT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__HOST_PORT = 2;

	/**
	 * The feature id for the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__CONTAINER_PORT = 3;

	/**
	 * The number of structural features of the '<em>Container Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ResourceRequirementsImpl <em>Resource Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ResourceRequirementsImpl
	 * @see k8s.impl.K8sPackageImpl#getResourceRequirements()
	 * @generated
	 */
	int RESOURCE_REQUIREMENTS = 16;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS__LIMITS = 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS__REQUESTS = 1;

	/**
	 * The number of structural features of the '<em>Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.EnvVarImpl <em>Env Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.EnvVarImpl
	 * @see k8s.impl.K8sPackageImpl#getEnvVar()
	 * @generated
	 */
	int ENV_VAR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__VALUE_FROM = 2;

	/**
	 * The number of structural features of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.EnvVarSourceImpl <em>Env Var Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.EnvVarSourceImpl
	 * @see k8s.impl.K8sPackageImpl#getEnvVarSource()
	 * @generated
	 */
	int ENV_VAR_SOURCE = 18;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_SOURCE__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>Secret Key Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_SOURCE__SECRET_KEY_REF = 1;

	/**
	 * The number of structural features of the '<em>Env Var Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Env Var Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.SecretKeySelectorImpl <em>Secret Key Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.SecretKeySelectorImpl
	 * @see k8s.impl.K8sPackageImpl#getSecretKeySelector()
	 * @generated
	 */
	int SECRET_KEY_SELECTOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_SELECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_SELECTOR__KEY = 1;

	/**
	 * The number of structural features of the '<em>Secret Key Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Secret Key Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_KEY_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ObjectFieldSelectorImpl <em>Object Field Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ObjectFieldSelectorImpl
	 * @see k8s.impl.K8sPackageImpl#getObjectFieldSelector()
	 * @generated
	 */
	int OBJECT_FIELD_SELECTOR = 20;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FIELD_SELECTOR__API_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Field Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FIELD_SELECTOR__FIELD_PATH = 1;

	/**
	 * The number of structural features of the '<em>Object Field Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FIELD_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Field Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FIELD_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.HTTPHeaderImpl <em>HTTP Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.HTTPHeaderImpl
	 * @see k8s.impl.K8sPackageImpl#getHTTPHeader()
	 * @generated
	 */
	int HTTP_HEADER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>HTTP Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HTTP Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.VolumeMountImpl <em>Volume Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.VolumeMountImpl
	 * @see k8s.impl.K8sPackageImpl#getVolumeMount()
	 * @generated
	 */
	int VOLUME_MOUNT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__MOUNT_PATH = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__READ_ONLY = 2;

	/**
	 * The number of structural features of the '<em>Volume Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Volume Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.HTTPGetActionImpl <em>HTTP Get Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.HTTPGetActionImpl
	 * @see k8s.impl.K8sPackageImpl#getHTTPGetAction()
	 * @generated
	 */
	int HTTP_GET_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION__PATH = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION__PORT = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION__SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Http Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION__HTTP_HEADERS = 3;

	/**
	 * The number of structural features of the '<em>HTTP Get Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HTTP Get Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_GET_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ProbeImpl <em>Probe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ProbeImpl
	 * @see k8s.impl.K8sPackageImpl#getProbe()
	 * @generated
	 */
	int PROBE = 24;

	/**
	 * The feature id for the '<em><b>Http Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__HTTP_GET = 0;

	/**
	 * The feature id for the '<em><b>Exec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__EXEC = 1;

	/**
	 * The feature id for the '<em><b>Initial Delay Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__INITIAL_DELAY_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE__TIMEOUT_SECONDS = 3;

	/**
	 * The number of structural features of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Probe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.ExecActionImpl <em>Exec Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.ExecActionImpl
	 * @see k8s.impl.K8sPackageImpl#getExecAction()
	 * @generated
	 */
	int EXEC_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ACTION__COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Exec Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exec Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.HandlerImpl
	 * @see k8s.impl.K8sPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 26;

	/**
	 * The feature id for the '<em><b>Exec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__EXEC = 0;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.LifeCycleImpl
	 * @see k8s.impl.K8sPackageImpl#getLifeCycle()
	 * @generated
	 */
	int LIFE_CYCLE = 27;

	/**
	 * The feature id for the '<em><b>Post Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__POST_START = 0;

	/**
	 * The feature id for the '<em><b>Pre Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE__PRE_STOP = 1;

	/**
	 * The number of structural features of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Life Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_CYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.HostPathVolumeSourceImpl <em>Host Path Volume Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.HostPathVolumeSourceImpl
	 * @see k8s.impl.K8sPackageImpl#getHostPathVolumeSource()
	 * @generated
	 */
	int HOST_PATH_VOLUME_SOURCE = 28;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PATH_VOLUME_SOURCE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Host Path Volume Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PATH_VOLUME_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Host Path Volume Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_PATH_VOLUME_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.NodeAffinityImpl <em>Node Affinity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.NodeAffinityImpl
	 * @see k8s.impl.K8sPackageImpl#getNodeAffinity()
	 * @generated
	 */
	int NODE_AFFINITY = 29;

	/**
	 * The feature id for the '<em><b>Required During Scheduling Ignored During Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = 0;

	/**
	 * The number of structural features of the '<em>Node Affinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AFFINITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Affinity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AFFINITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.NodeSelectorImpl <em>Node Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.NodeSelectorImpl
	 * @see k8s.impl.K8sPackageImpl#getNodeSelector()
	 * @generated
	 */
	int NODE_SELECTOR = 30;

	/**
	 * The feature id for the '<em><b>Node Selector Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR__NODE_SELECTOR_TERMS = 0;

	/**
	 * The number of structural features of the '<em>Node Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.NodeSelectorTermImpl <em>Node Selector Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.NodeSelectorTermImpl
	 * @see k8s.impl.K8sPackageImpl#getNodeSelectorTerm()
	 * @generated
	 */
	int NODE_SELECTOR_TERM = 31;

	/**
	 * The feature id for the '<em><b>Match Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_TERM__MATCH_EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Node Selector Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Selector Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.NodeSelectorRequirementImpl <em>Node Selector Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.NodeSelectorRequirementImpl
	 * @see k8s.impl.K8sPackageImpl#getNodeSelectorRequirement()
	 * @generated
	 */
	int NODE_SELECTOR_REQUIREMENT = 32;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_REQUIREMENT__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_REQUIREMENT__KEY = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_REQUIREMENT__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Node Selector Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Selector Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTOR_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.impl.MymapImpl <em>Mymap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.impl.MymapImpl
	 * @see k8s.impl.K8sPackageImpl#getMymap()
	 * @generated
	 */
	int MYMAP = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYMAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYMAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mymap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYMAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mymap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MYMAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link k8s.ApiVersion <em>Api Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.ApiVersion
	 * @see k8s.impl.K8sPackageImpl#getApiVersion()
	 * @generated
	 */
	int API_VERSION = 34;

	/**
	 * The meta object id for the '{@link k8s.Kind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see k8s.Kind
	 * @see k8s.impl.K8sPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 35;


	/**
	 * Returns the meta object for class '{@link k8s.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest</em>'.
	 * @see k8s.Manifest
	 * @generated
	 */
	EClass getManifest();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Manifest#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see k8s.Manifest#getApiVersion()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Manifest#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see k8s.Manifest#getKind()
	 * @see #getManifest()
	 * @generated
	 */
	EAttribute getManifest_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Manifest#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see k8s.Manifest#getMetadata()
	 * @see #getManifest()
	 * @generated
	 */
	EReference getManifest_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Manifest#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see k8s.Manifest#getSpec()
	 * @see #getManifest()
	 * @generated
	 */
	EReference getManifest_Spec();

	/**
	 * Returns the meta object for class '{@link k8s.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see k8s.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Metadata#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.Metadata#getName()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Metadata#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see k8s.Metadata#getNamespace()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Metadata#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labels</em>'.
	 * @see k8s.Metadata#getLabels()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Metadata#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see k8s.Metadata#getAnnotations()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Annotations();

	/**
	 * Returns the meta object for class '{@link k8s.Spec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec</em>'.
	 * @see k8s.Spec
	 * @generated
	 */
	EClass getSpec();

	/**
	 * Returns the meta object for class '{@link k8s.PodSpec <em>Pod Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod Spec</em>'.
	 * @see k8s.PodSpec
	 * @generated
	 */
	EClass getPodSpec();

	/**
	 * Returns the meta object for the attribute '{@link k8s.PodSpec#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see k8s.PodSpec#getRestartPolicy()
	 * @see #getPodSpec()
	 * @generated
	 */
	EAttribute getPodSpec_RestartPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.PodSpec#getAffinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Affinity</em>'.
	 * @see k8s.PodSpec#getAffinity()
	 * @see #getPodSpec()
	 * @generated
	 */
	EReference getPodSpec_Affinity();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.PodSpec#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see k8s.PodSpec#getContainers()
	 * @see #getPodSpec()
	 * @generated
	 */
	EReference getPodSpec_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.PodSpec#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see k8s.PodSpec#getVolumes()
	 * @see #getPodSpec()
	 * @generated
	 */
	EReference getPodSpec_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.PodSpec#getTopologySpreadConstraints <em>Topology Spread Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topology Spread Constraints</em>'.
	 * @see k8s.PodSpec#getTopologySpreadConstraints()
	 * @see #getPodSpec()
	 * @generated
	 */
	EReference getPodSpec_TopologySpreadConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.PodSpec#getInitContainers <em>Init Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Containers</em>'.
	 * @see k8s.PodSpec#getInitContainers()
	 * @see #getPodSpec()
	 * @generated
	 */
	EReference getPodSpec_InitContainers();

	/**
	 * Returns the meta object for class '{@link k8s.DeploymentSpec <em>Deployment Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Spec</em>'.
	 * @see k8s.DeploymentSpec
	 * @generated
	 */
	EClass getDeploymentSpec();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.DeploymentSpec#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see k8s.DeploymentSpec#getSelector()
	 * @see #getDeploymentSpec()
	 * @generated
	 */
	EReference getDeploymentSpec_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.DeploymentSpec#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see k8s.DeploymentSpec#getStrategy()
	 * @see #getDeploymentSpec()
	 * @generated
	 */
	EReference getDeploymentSpec_Strategy();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.DeploymentSpec#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see k8s.DeploymentSpec#getTemplate()
	 * @see #getDeploymentSpec()
	 * @generated
	 */
	EReference getDeploymentSpec_Template();

	/**
	 * Returns the meta object for class '{@link k8s.DeploymentStrategy <em>Deployment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Strategy</em>'.
	 * @see k8s.DeploymentStrategy
	 * @generated
	 */
	EClass getDeploymentStrategy();

	/**
	 * Returns the meta object for the attribute '{@link k8s.DeploymentStrategy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see k8s.DeploymentStrategy#getType()
	 * @see #getDeploymentStrategy()
	 * @generated
	 */
	EAttribute getDeploymentStrategy_Type();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.DeploymentStrategy#getRollingUpdate <em>Rolling Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolling Update</em>'.
	 * @see k8s.DeploymentStrategy#getRollingUpdate()
	 * @see #getDeploymentStrategy()
	 * @generated
	 */
	EReference getDeploymentStrategy_RollingUpdate();

	/**
	 * Returns the meta object for class '{@link k8s.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see k8s.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.Selector#getMatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match Expressions</em>'.
	 * @see k8s.Selector#getMatchExpressions()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_MatchExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Selector#getMatchLabels <em>Match Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Match Labels</em>'.
	 * @see k8s.Selector#getMatchLabels()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_MatchLabels();

	/**
	 * Returns the meta object for class '{@link k8s.PodTemplate <em>Pod Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod Template</em>'.
	 * @see k8s.PodTemplate
	 * @generated
	 */
	EClass getPodTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.PodTemplate#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see k8s.PodTemplate#getMetadata()
	 * @see #getPodTemplate()
	 * @generated
	 */
	EReference getPodTemplate_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.PodTemplate#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see k8s.PodTemplate#getSpec()
	 * @see #getPodTemplate()
	 * @generated
	 */
	EReference getPodTemplate_Spec();

	/**
	 * Returns the meta object for class '{@link k8s.TopologySpreadConstraint <em>Topology Spread Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Spread Constraint</em>'.
	 * @see k8s.TopologySpreadConstraint
	 * @generated
	 */
	EClass getTopologySpreadConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.TopologySpreadConstraint#getLabelSelector <em>Label Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Selector</em>'.
	 * @see k8s.TopologySpreadConstraint#getLabelSelector()
	 * @see #getTopologySpreadConstraint()
	 * @generated
	 */
	EReference getTopologySpreadConstraint_LabelSelector();

	/**
	 * Returns the meta object for the attribute '{@link k8s.TopologySpreadConstraint#getTopologyKey <em>Topology Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topology Key</em>'.
	 * @see k8s.TopologySpreadConstraint#getTopologyKey()
	 * @see #getTopologySpreadConstraint()
	 * @generated
	 */
	EAttribute getTopologySpreadConstraint_TopologyKey();

	/**
	 * Returns the meta object for the attribute '{@link k8s.TopologySpreadConstraint#getWhenUnsatisfiable <em>When Unsatisfiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Unsatisfiable</em>'.
	 * @see k8s.TopologySpreadConstraint#getWhenUnsatisfiable()
	 * @see #getTopologySpreadConstraint()
	 * @generated
	 */
	EAttribute getTopologySpreadConstraint_WhenUnsatisfiable();

	/**
	 * Returns the meta object for the attribute '{@link k8s.TopologySpreadConstraint#getMaxSkew <em>Max Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Skew</em>'.
	 * @see k8s.TopologySpreadConstraint#getMaxSkew()
	 * @see #getTopologySpreadConstraint()
	 * @generated
	 */
	EAttribute getTopologySpreadConstraint_MaxSkew();

	/**
	 * Returns the meta object for class '{@link k8s.Containers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containers</em>'.
	 * @see k8s.Containers
	 * @generated
	 */
	EClass getContainers();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Containers#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.Containers#getName()
	 * @see #getContainers()
	 * @generated
	 */
	EAttribute getContainers_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Containers#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see k8s.Containers#getImage()
	 * @see #getContainers()
	 * @generated
	 */
	EAttribute getContainers_Image();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Containers#isLiveRestart <em>Live Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live Restart</em>'.
	 * @see k8s.Containers#isLiveRestart()
	 * @see #getContainers()
	 * @generated
	 */
	EAttribute getContainers_LiveRestart();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.Containers#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see k8s.Containers#getCommand()
	 * @see #getContainers()
	 * @generated
	 */
	EAttribute getContainers_Command();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.Containers#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see k8s.Containers#getArgs()
	 * @see #getContainers()
	 * @generated
	 */
	EAttribute getContainers_Args();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Containers#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see k8s.Containers#getResources()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Containers#getLivenessProbe <em>Liveness Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liveness Probe</em>'.
	 * @see k8s.Containers#getLivenessProbe()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_LivenessProbe();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Containers#getReadinessProbe <em>Readiness Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Readiness Probe</em>'.
	 * @see k8s.Containers#getReadinessProbe()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_ReadinessProbe();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Containers#getLifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Life Cycle</em>'.
	 * @see k8s.Containers#getLifeCycle()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_LifeCycle();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.Containers#getVolumeMounts <em>Volume Mounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume Mounts</em>'.
	 * @see k8s.Containers#getVolumeMounts()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_VolumeMounts();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.Containers#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see k8s.Containers#getEnv()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.Containers#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see k8s.Containers#getPorts()
	 * @see #getContainers()
	 * @generated
	 */
	EReference getContainers_Ports();

	/**
	 * Returns the meta object for class '{@link k8s.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see k8s.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Volume#getHostPath <em>Host Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Host Path</em>'.
	 * @see k8s.Volume#getHostPath()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_HostPath();

	/**
	 * Returns the meta object for class '{@link k8s.Affinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affinity</em>'.
	 * @see k8s.Affinity
	 * @generated
	 */
	EClass getAffinity();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Affinity#getNodeAffinity <em>Node Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Affinity</em>'.
	 * @see k8s.Affinity#getNodeAffinity()
	 * @see #getAffinity()
	 * @generated
	 */
	EReference getAffinity_NodeAffinity();

	/**
	 * Returns the meta object for class '{@link k8s.RollingUpdateDeployment <em>Rolling Update Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rolling Update Deployment</em>'.
	 * @see k8s.RollingUpdateDeployment
	 * @generated
	 */
	EClass getRollingUpdateDeployment();

	/**
	 * Returns the meta object for the attribute '{@link k8s.RollingUpdateDeployment#getMaxUnavailable <em>Max Unavailable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Unavailable</em>'.
	 * @see k8s.RollingUpdateDeployment#getMaxUnavailable()
	 * @see #getRollingUpdateDeployment()
	 * @generated
	 */
	EAttribute getRollingUpdateDeployment_MaxUnavailable();

	/**
	 * Returns the meta object for the attribute '{@link k8s.RollingUpdateDeployment#getMaxSurge <em>Max Surge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Surge</em>'.
	 * @see k8s.RollingUpdateDeployment#getMaxSurge()
	 * @see #getRollingUpdateDeployment()
	 * @generated
	 */
	EAttribute getRollingUpdateDeployment_MaxSurge();

	/**
	 * Returns the meta object for class '{@link k8s.LabelSelector <em>Label Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Selector</em>'.
	 * @see k8s.LabelSelector
	 * @generated
	 */
	EClass getLabelSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.LabelSelector#getMatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match Expressions</em>'.
	 * @see k8s.LabelSelector#getMatchExpressions()
	 * @see #getLabelSelector()
	 * @generated
	 */
	EReference getLabelSelector_MatchExpressions();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.LabelSelector#getMatchLabels <em>Match Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Match Labels</em>'.
	 * @see k8s.LabelSelector#getMatchLabels()
	 * @see #getLabelSelector()
	 * @generated
	 */
	EReference getLabelSelector_MatchLabels();

	/**
	 * Returns the meta object for class '{@link k8s.MatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Expressions</em>'.
	 * @see k8s.MatchExpressions
	 * @generated
	 */
	EClass getMatchExpressions();

	/**
	 * Returns the meta object for the attribute '{@link k8s.MatchExpressions#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see k8s.MatchExpressions#getKey()
	 * @see #getMatchExpressions()
	 * @generated
	 */
	EAttribute getMatchExpressions_Key();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.MatchExpressions#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see k8s.MatchExpressions#getValues()
	 * @see #getMatchExpressions()
	 * @generated
	 */
	EAttribute getMatchExpressions_Values();

	/**
	 * Returns the meta object for the attribute '{@link k8s.MatchExpressions#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see k8s.MatchExpressions#getOperator()
	 * @see #getMatchExpressions()
	 * @generated
	 */
	EAttribute getMatchExpressions_Operator();

	/**
	 * Returns the meta object for class '{@link k8s.ContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Port</em>'.
	 * @see k8s.ContainerPort
	 * @generated
	 */
	EClass getContainerPort();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ContainerPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.ContainerPort#getName()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ContainerPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see k8s.ContainerPort#getProtocol()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ContainerPort#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see k8s.ContainerPort#getHostPort()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_HostPort();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ContainerPort#getContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Port</em>'.
	 * @see k8s.ContainerPort#getContainerPort()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_ContainerPort();

	/**
	 * Returns the meta object for class '{@link k8s.ResourceRequirements <em>Resource Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirements</em>'.
	 * @see k8s.ResourceRequirements
	 * @generated
	 */
	EClass getResourceRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.ResourceRequirements#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limits</em>'.
	 * @see k8s.ResourceRequirements#getLimits()
	 * @see #getResourceRequirements()
	 * @generated
	 */
	EReference getResourceRequirements_Limits();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.ResourceRequirements#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requests</em>'.
	 * @see k8s.ResourceRequirements#getRequests()
	 * @see #getResourceRequirements()
	 * @generated
	 */
	EReference getResourceRequirements_Requests();

	/**
	 * Returns the meta object for class '{@link k8s.EnvVar <em>Env Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Var</em>'.
	 * @see k8s.EnvVar
	 * @generated
	 */
	EClass getEnvVar();

	/**
	 * Returns the meta object for the attribute '{@link k8s.EnvVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.EnvVar#getName()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.EnvVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see k8s.EnvVar#getValue()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Value();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.EnvVar#getValueFrom <em>Value From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value From</em>'.
	 * @see k8s.EnvVar#getValueFrom()
	 * @see #getEnvVar()
	 * @generated
	 */
	EReference getEnvVar_ValueFrom();

	/**
	 * Returns the meta object for class '{@link k8s.EnvVarSource <em>Env Var Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Var Source</em>'.
	 * @see k8s.EnvVarSource
	 * @generated
	 */
	EClass getEnvVarSource();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.EnvVarSource#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Ref</em>'.
	 * @see k8s.EnvVarSource#getFieldRef()
	 * @see #getEnvVarSource()
	 * @generated
	 */
	EReference getEnvVarSource_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.EnvVarSource#getSecretKeyRef <em>Secret Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secret Key Ref</em>'.
	 * @see k8s.EnvVarSource#getSecretKeyRef()
	 * @see #getEnvVarSource()
	 * @generated
	 */
	EReference getEnvVarSource_SecretKeyRef();

	/**
	 * Returns the meta object for class '{@link k8s.SecretKeySelector <em>Secret Key Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret Key Selector</em>'.
	 * @see k8s.SecretKeySelector
	 * @generated
	 */
	EClass getSecretKeySelector();

	/**
	 * Returns the meta object for the attribute '{@link k8s.SecretKeySelector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.SecretKeySelector#getName()
	 * @see #getSecretKeySelector()
	 * @generated
	 */
	EAttribute getSecretKeySelector_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.SecretKeySelector#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see k8s.SecretKeySelector#getKey()
	 * @see #getSecretKeySelector()
	 * @generated
	 */
	EAttribute getSecretKeySelector_Key();

	/**
	 * Returns the meta object for class '{@link k8s.ObjectFieldSelector <em>Object Field Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Field Selector</em>'.
	 * @see k8s.ObjectFieldSelector
	 * @generated
	 */
	EClass getObjectFieldSelector();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ObjectFieldSelector#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see k8s.ObjectFieldSelector#getApiVersion()
	 * @see #getObjectFieldSelector()
	 * @generated
	 */
	EAttribute getObjectFieldSelector_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link k8s.ObjectFieldSelector#getFieldPath <em>Field Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Path</em>'.
	 * @see k8s.ObjectFieldSelector#getFieldPath()
	 * @see #getObjectFieldSelector()
	 * @generated
	 */
	EAttribute getObjectFieldSelector_FieldPath();

	/**
	 * Returns the meta object for class '{@link k8s.HTTPHeader <em>HTTP Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Header</em>'.
	 * @see k8s.HTTPHeader
	 * @generated
	 */
	EClass getHTTPHeader();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HTTPHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.HTTPHeader#getName()
	 * @see #getHTTPHeader()
	 * @generated
	 */
	EAttribute getHTTPHeader_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HTTPHeader#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see k8s.HTTPHeader#getValue()
	 * @see #getHTTPHeader()
	 * @generated
	 */
	EAttribute getHTTPHeader_Value();

	/**
	 * Returns the meta object for class '{@link k8s.VolumeMount <em>Volume Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Mount</em>'.
	 * @see k8s.VolumeMount
	 * @generated
	 */
	EClass getVolumeMount();

	/**
	 * Returns the meta object for the attribute '{@link k8s.VolumeMount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see k8s.VolumeMount#getName()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_Name();

	/**
	 * Returns the meta object for the attribute '{@link k8s.VolumeMount#getMountPath <em>Mount Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Path</em>'.
	 * @see k8s.VolumeMount#getMountPath()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_MountPath();

	/**
	 * Returns the meta object for the attribute '{@link k8s.VolumeMount#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see k8s.VolumeMount#isReadOnly()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_ReadOnly();

	/**
	 * Returns the meta object for class '{@link k8s.HTTPGetAction <em>HTTP Get Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Get Action</em>'.
	 * @see k8s.HTTPGetAction
	 * @generated
	 */
	EClass getHTTPGetAction();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HTTPGetAction#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see k8s.HTTPGetAction#getPath()
	 * @see #getHTTPGetAction()
	 * @generated
	 */
	EAttribute getHTTPGetAction_Path();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HTTPGetAction#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see k8s.HTTPGetAction#getPort()
	 * @see #getHTTPGetAction()
	 * @generated
	 */
	EAttribute getHTTPGetAction_Port();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HTTPGetAction#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see k8s.HTTPGetAction#getScheme()
	 * @see #getHTTPGetAction()
	 * @generated
	 */
	EAttribute getHTTPGetAction_Scheme();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.HTTPGetAction#getHttpHeaders <em>Http Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Http Headers</em>'.
	 * @see k8s.HTTPGetAction#getHttpHeaders()
	 * @see #getHTTPGetAction()
	 * @generated
	 */
	EAttribute getHTTPGetAction_HttpHeaders();

	/**
	 * Returns the meta object for class '{@link k8s.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probe</em>'.
	 * @see k8s.Probe
	 * @generated
	 */
	EClass getProbe();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Probe#getHttpGet <em>Http Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Get</em>'.
	 * @see k8s.Probe#getHttpGet()
	 * @see #getProbe()
	 * @generated
	 */
	EReference getProbe_HttpGet();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Probe#getExec <em>Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exec</em>'.
	 * @see k8s.Probe#getExec()
	 * @see #getProbe()
	 * @generated
	 */
	EReference getProbe_Exec();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Probe#getInitialDelaySeconds <em>Initial Delay Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Delay Seconds</em>'.
	 * @see k8s.Probe#getInitialDelaySeconds()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_InitialDelaySeconds();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Probe#getTimeoutSeconds <em>Timeout Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Seconds</em>'.
	 * @see k8s.Probe#getTimeoutSeconds()
	 * @see #getProbe()
	 * @generated
	 */
	EAttribute getProbe_TimeoutSeconds();

	/**
	 * Returns the meta object for class '{@link k8s.ExecAction <em>Exec Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Action</em>'.
	 * @see k8s.ExecAction
	 * @generated
	 */
	EClass getExecAction();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.ExecAction#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see k8s.ExecAction#getCommand()
	 * @see #getExecAction()
	 * @generated
	 */
	EAttribute getExecAction_Command();

	/**
	 * Returns the meta object for class '{@link k8s.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see k8s.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.Handler#getExec <em>Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exec</em>'.
	 * @see k8s.Handler#getExec()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Exec();

	/**
	 * Returns the meta object for class '{@link k8s.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Cycle</em>'.
	 * @see k8s.LifeCycle
	 * @generated
	 */
	EClass getLifeCycle();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.LifeCycle#getPostStart <em>Post Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Start</em>'.
	 * @see k8s.LifeCycle#getPostStart()
	 * @see #getLifeCycle()
	 * @generated
	 */
	EReference getLifeCycle_PostStart();

	/**
	 * Returns the meta object for the containment reference '{@link k8s.LifeCycle#getPreStop <em>Pre Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Stop</em>'.
	 * @see k8s.LifeCycle#getPreStop()
	 * @see #getLifeCycle()
	 * @generated
	 */
	EReference getLifeCycle_PreStop();

	/**
	 * Returns the meta object for class '{@link k8s.HostPathVolumeSource <em>Host Path Volume Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Path Volume Source</em>'.
	 * @see k8s.HostPathVolumeSource
	 * @generated
	 */
	EClass getHostPathVolumeSource();

	/**
	 * Returns the meta object for the attribute '{@link k8s.HostPathVolumeSource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see k8s.HostPathVolumeSource#getPath()
	 * @see #getHostPathVolumeSource()
	 * @generated
	 */
	EAttribute getHostPathVolumeSource_Path();

	/**
	 * Returns the meta object for class '{@link k8s.NodeAffinity <em>Node Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Affinity</em>'.
	 * @see k8s.NodeAffinity
	 * @generated
	 */
	EClass getNodeAffinity();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution <em>Required During Scheduling Ignored During Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required During Scheduling Ignored During Execution</em>'.
	 * @see k8s.NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution()
	 * @see #getNodeAffinity()
	 * @generated
	 */
	EReference getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution();

	/**
	 * Returns the meta object for class '{@link k8s.NodeSelector <em>Node Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Selector</em>'.
	 * @see k8s.NodeSelector
	 * @generated
	 */
	EClass getNodeSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.NodeSelector#getNodeSelectorTerms <em>Node Selector Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Selector Terms</em>'.
	 * @see k8s.NodeSelector#getNodeSelectorTerms()
	 * @see #getNodeSelector()
	 * @generated
	 */
	EReference getNodeSelector_NodeSelectorTerms();

	/**
	 * Returns the meta object for class '{@link k8s.NodeSelectorTerm <em>Node Selector Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Selector Term</em>'.
	 * @see k8s.NodeSelectorTerm
	 * @generated
	 */
	EClass getNodeSelectorTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link k8s.NodeSelectorTerm#getMatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match Expressions</em>'.
	 * @see k8s.NodeSelectorTerm#getMatchExpressions()
	 * @see #getNodeSelectorTerm()
	 * @generated
	 */
	EReference getNodeSelectorTerm_MatchExpressions();

	/**
	 * Returns the meta object for class '{@link k8s.NodeSelectorRequirement <em>Node Selector Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Selector Requirement</em>'.
	 * @see k8s.NodeSelectorRequirement
	 * @generated
	 */
	EClass getNodeSelectorRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link k8s.NodeSelectorRequirement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see k8s.NodeSelectorRequirement#getValues()
	 * @see #getNodeSelectorRequirement()
	 * @generated
	 */
	EAttribute getNodeSelectorRequirement_Values();

	/**
	 * Returns the meta object for the attribute '{@link k8s.NodeSelectorRequirement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see k8s.NodeSelectorRequirement#getKey()
	 * @see #getNodeSelectorRequirement()
	 * @generated
	 */
	EAttribute getNodeSelectorRequirement_Key();

	/**
	 * Returns the meta object for the attribute '{@link k8s.NodeSelectorRequirement#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see k8s.NodeSelectorRequirement#getOperator()
	 * @see #getNodeSelectorRequirement()
	 * @generated
	 */
	EAttribute getNodeSelectorRequirement_Operator();

	/**
	 * Returns the meta object for class '{@link k8s.Mymap <em>Mymap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mymap</em>'.
	 * @see k8s.Mymap
	 * @generated
	 */
	EClass getMymap();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Mymap#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see k8s.Mymap#getKey()
	 * @see #getMymap()
	 * @generated
	 */
	EAttribute getMymap_Key();

	/**
	 * Returns the meta object for the attribute '{@link k8s.Mymap#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see k8s.Mymap#getValue()
	 * @see #getMymap()
	 * @generated
	 */
	EAttribute getMymap_Value();

	/**
	 * Returns the meta object for enum '{@link k8s.ApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Api Version</em>'.
	 * @see k8s.ApiVersion
	 * @generated
	 */
	EEnum getApiVersion();

	/**
	 * Returns the meta object for enum '{@link k8s.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see k8s.Kind
	 * @generated
	 */
	EEnum getKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	K8sFactory getK8sFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link k8s.impl.ManifestImpl <em>Manifest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ManifestImpl
		 * @see k8s.impl.K8sPackageImpl#getManifest()
		 * @generated
		 */
		EClass MANIFEST = eINSTANCE.getManifest();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__API_VERSION = eINSTANCE.getManifest_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__KIND = eINSTANCE.getManifest_Kind();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__METADATA = eINSTANCE.getManifest_Metadata();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__SPEC = eINSTANCE.getManifest_Spec();

		/**
		 * The meta object literal for the '{@link k8s.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.MetadataImpl
		 * @see k8s.impl.K8sPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__NAME = eINSTANCE.getMetadata_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__NAMESPACE = eINSTANCE.getMetadata_Namespace();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__LABELS = eINSTANCE.getMetadata_Labels();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ANNOTATIONS = eINSTANCE.getMetadata_Annotations();

		/**
		 * The meta object literal for the '{@link k8s.Spec <em>Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.Spec
		 * @see k8s.impl.K8sPackageImpl#getSpec()
		 * @generated
		 */
		EClass SPEC = eINSTANCE.getSpec();

		/**
		 * The meta object literal for the '{@link k8s.impl.PodSpecImpl <em>Pod Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.PodSpecImpl
		 * @see k8s.impl.K8sPackageImpl#getPodSpec()
		 * @generated
		 */
		EClass POD_SPEC = eINSTANCE.getPodSpec();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD_SPEC__RESTART_POLICY = eINSTANCE.getPodSpec_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Affinity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_SPEC__AFFINITY = eINSTANCE.getPodSpec_Affinity();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_SPEC__CONTAINERS = eINSTANCE.getPodSpec_Containers();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_SPEC__VOLUMES = eINSTANCE.getPodSpec_Volumes();

		/**
		 * The meta object literal for the '<em><b>Topology Spread Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS = eINSTANCE.getPodSpec_TopologySpreadConstraints();

		/**
		 * The meta object literal for the '<em><b>Init Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_SPEC__INIT_CONTAINERS = eINSTANCE.getPodSpec_InitContainers();

		/**
		 * The meta object literal for the '{@link k8s.impl.DeploymentSpecImpl <em>Deployment Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.DeploymentSpecImpl
		 * @see k8s.impl.K8sPackageImpl#getDeploymentSpec()
		 * @generated
		 */
		EClass DEPLOYMENT_SPEC = eINSTANCE.getDeploymentSpec();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPEC__SELECTOR = eINSTANCE.getDeploymentSpec_Selector();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPEC__STRATEGY = eINSTANCE.getDeploymentSpec_Strategy();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_SPEC__TEMPLATE = eINSTANCE.getDeploymentSpec_Template();

		/**
		 * The meta object literal for the '{@link k8s.impl.DeploymentStrategyImpl <em>Deployment Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.DeploymentStrategyImpl
		 * @see k8s.impl.K8sPackageImpl#getDeploymentStrategy()
		 * @generated
		 */
		EClass DEPLOYMENT_STRATEGY = eINSTANCE.getDeploymentStrategy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_STRATEGY__TYPE = eINSTANCE.getDeploymentStrategy_Type();

		/**
		 * The meta object literal for the '<em><b>Rolling Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_STRATEGY__ROLLING_UPDATE = eINSTANCE.getDeploymentStrategy_RollingUpdate();

		/**
		 * The meta object literal for the '{@link k8s.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.SelectorImpl
		 * @see k8s.impl.K8sPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Match Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR__MATCH_EXPRESSIONS = eINSTANCE.getSelector_MatchExpressions();

		/**
		 * The meta object literal for the '<em><b>Match Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR__MATCH_LABELS = eINSTANCE.getSelector_MatchLabels();

		/**
		 * The meta object literal for the '{@link k8s.impl.PodTemplateImpl <em>Pod Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.PodTemplateImpl
		 * @see k8s.impl.K8sPackageImpl#getPodTemplate()
		 * @generated
		 */
		EClass POD_TEMPLATE = eINSTANCE.getPodTemplate();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE__METADATA = eINSTANCE.getPodTemplate_Metadata();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE__SPEC = eINSTANCE.getPodTemplate_Spec();

		/**
		 * The meta object literal for the '{@link k8s.impl.TopologySpreadConstraintImpl <em>Topology Spread Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.TopologySpreadConstraintImpl
		 * @see k8s.impl.K8sPackageImpl#getTopologySpreadConstraint()
		 * @generated
		 */
		EClass TOPOLOGY_SPREAD_CONSTRAINT = eINSTANCE.getTopologySpreadConstraint();

		/**
		 * The meta object literal for the '<em><b>Label Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR = eINSTANCE.getTopologySpreadConstraint_LabelSelector();

		/**
		 * The meta object literal for the '<em><b>Topology Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY = eINSTANCE.getTopologySpreadConstraint_TopologyKey();

		/**
		 * The meta object literal for the '<em><b>When Unsatisfiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE = eINSTANCE.getTopologySpreadConstraint_WhenUnsatisfiable();

		/**
		 * The meta object literal for the '<em><b>Max Skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW = eINSTANCE.getTopologySpreadConstraint_MaxSkew();

		/**
		 * The meta object literal for the '{@link k8s.impl.ContainersImpl <em>Containers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ContainersImpl
		 * @see k8s.impl.K8sPackageImpl#getContainers()
		 * @generated
		 */
		EClass CONTAINERS = eINSTANCE.getContainers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINERS__NAME = eINSTANCE.getContainers_Name();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINERS__IMAGE = eINSTANCE.getContainers_Image();

		/**
		 * The meta object literal for the '<em><b>Live Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINERS__LIVE_RESTART = eINSTANCE.getContainers_LiveRestart();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINERS__COMMAND = eINSTANCE.getContainers_Command();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINERS__ARGS = eINSTANCE.getContainers_Args();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__RESOURCES = eINSTANCE.getContainers_Resources();

		/**
		 * The meta object literal for the '<em><b>Liveness Probe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__LIVENESS_PROBE = eINSTANCE.getContainers_LivenessProbe();

		/**
		 * The meta object literal for the '<em><b>Readiness Probe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__READINESS_PROBE = eINSTANCE.getContainers_ReadinessProbe();

		/**
		 * The meta object literal for the '<em><b>Life Cycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__LIFE_CYCLE = eINSTANCE.getContainers_LifeCycle();

		/**
		 * The meta object literal for the '<em><b>Volume Mounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__VOLUME_MOUNTS = eINSTANCE.getContainers_VolumeMounts();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__ENV = eINSTANCE.getContainers_Env();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINERS__PORTS = eINSTANCE.getContainers_Ports();

		/**
		 * The meta object literal for the '{@link k8s.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.VolumeImpl
		 * @see k8s.impl.K8sPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '<em><b>Host Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__HOST_PATH = eINSTANCE.getVolume_HostPath();

		/**
		 * The meta object literal for the '{@link k8s.impl.AffinityImpl <em>Affinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.AffinityImpl
		 * @see k8s.impl.K8sPackageImpl#getAffinity()
		 * @generated
		 */
		EClass AFFINITY = eINSTANCE.getAffinity();

		/**
		 * The meta object literal for the '<em><b>Node Affinity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFINITY__NODE_AFFINITY = eINSTANCE.getAffinity_NodeAffinity();

		/**
		 * The meta object literal for the '{@link k8s.impl.RollingUpdateDeploymentImpl <em>Rolling Update Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.RollingUpdateDeploymentImpl
		 * @see k8s.impl.K8sPackageImpl#getRollingUpdateDeployment()
		 * @generated
		 */
		EClass ROLLING_UPDATE_DEPLOYMENT = eINSTANCE.getRollingUpdateDeployment();

		/**
		 * The meta object literal for the '<em><b>Max Unavailable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE = eINSTANCE.getRollingUpdateDeployment_MaxUnavailable();

		/**
		 * The meta object literal for the '<em><b>Max Surge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE = eINSTANCE.getRollingUpdateDeployment_MaxSurge();

		/**
		 * The meta object literal for the '{@link k8s.impl.LabelSelectorImpl <em>Label Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.LabelSelectorImpl
		 * @see k8s.impl.K8sPackageImpl#getLabelSelector()
		 * @generated
		 */
		EClass LABEL_SELECTOR = eINSTANCE.getLabelSelector();

		/**
		 * The meta object literal for the '<em><b>Match Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SELECTOR__MATCH_EXPRESSIONS = eINSTANCE.getLabelSelector_MatchExpressions();

		/**
		 * The meta object literal for the '<em><b>Match Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SELECTOR__MATCH_LABELS = eINSTANCE.getLabelSelector_MatchLabels();

		/**
		 * The meta object literal for the '{@link k8s.impl.MatchExpressionsImpl <em>Match Expressions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.MatchExpressionsImpl
		 * @see k8s.impl.K8sPackageImpl#getMatchExpressions()
		 * @generated
		 */
		EClass MATCH_EXPRESSIONS = eINSTANCE.getMatchExpressions();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_EXPRESSIONS__KEY = eINSTANCE.getMatchExpressions_Key();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_EXPRESSIONS__VALUES = eINSTANCE.getMatchExpressions_Values();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_EXPRESSIONS__OPERATOR = eINSTANCE.getMatchExpressions_Operator();

		/**
		 * The meta object literal for the '{@link k8s.impl.ContainerPortImpl <em>Container Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ContainerPortImpl
		 * @see k8s.impl.K8sPackageImpl#getContainerPort()
		 * @generated
		 */
		EClass CONTAINER_PORT = eINSTANCE.getContainerPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__NAME = eINSTANCE.getContainerPort_Name();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__PROTOCOL = eINSTANCE.getContainerPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__HOST_PORT = eINSTANCE.getContainerPort_HostPort();

		/**
		 * The meta object literal for the '<em><b>Container Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__CONTAINER_PORT = eINSTANCE.getContainerPort_ContainerPort();

		/**
		 * The meta object literal for the '{@link k8s.impl.ResourceRequirementsImpl <em>Resource Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ResourceRequirementsImpl
		 * @see k8s.impl.K8sPackageImpl#getResourceRequirements()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENTS = eINSTANCE.getResourceRequirements();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENTS__LIMITS = eINSTANCE.getResourceRequirements_Limits();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENTS__REQUESTS = eINSTANCE.getResourceRequirements_Requests();

		/**
		 * The meta object literal for the '{@link k8s.impl.EnvVarImpl <em>Env Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.EnvVarImpl
		 * @see k8s.impl.K8sPackageImpl#getEnvVar()
		 * @generated
		 */
		EClass ENV_VAR = eINSTANCE.getEnvVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__NAME = eINSTANCE.getEnvVar_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__VALUE = eINSTANCE.getEnvVar_Value();

		/**
		 * The meta object literal for the '<em><b>Value From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VAR__VALUE_FROM = eINSTANCE.getEnvVar_ValueFrom();

		/**
		 * The meta object literal for the '{@link k8s.impl.EnvVarSourceImpl <em>Env Var Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.EnvVarSourceImpl
		 * @see k8s.impl.K8sPackageImpl#getEnvVarSource()
		 * @generated
		 */
		EClass ENV_VAR_SOURCE = eINSTANCE.getEnvVarSource();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VAR_SOURCE__FIELD_REF = eINSTANCE.getEnvVarSource_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Secret Key Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VAR_SOURCE__SECRET_KEY_REF = eINSTANCE.getEnvVarSource_SecretKeyRef();

		/**
		 * The meta object literal for the '{@link k8s.impl.SecretKeySelectorImpl <em>Secret Key Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.SecretKeySelectorImpl
		 * @see k8s.impl.K8sPackageImpl#getSecretKeySelector()
		 * @generated
		 */
		EClass SECRET_KEY_SELECTOR = eINSTANCE.getSecretKeySelector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET_KEY_SELECTOR__NAME = eINSTANCE.getSecretKeySelector_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET_KEY_SELECTOR__KEY = eINSTANCE.getSecretKeySelector_Key();

		/**
		 * The meta object literal for the '{@link k8s.impl.ObjectFieldSelectorImpl <em>Object Field Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ObjectFieldSelectorImpl
		 * @see k8s.impl.K8sPackageImpl#getObjectFieldSelector()
		 * @generated
		 */
		EClass OBJECT_FIELD_SELECTOR = eINSTANCE.getObjectFieldSelector();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FIELD_SELECTOR__API_VERSION = eINSTANCE.getObjectFieldSelector_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Field Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FIELD_SELECTOR__FIELD_PATH = eINSTANCE.getObjectFieldSelector_FieldPath();

		/**
		 * The meta object literal for the '{@link k8s.impl.HTTPHeaderImpl <em>HTTP Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.HTTPHeaderImpl
		 * @see k8s.impl.K8sPackageImpl#getHTTPHeader()
		 * @generated
		 */
		EClass HTTP_HEADER = eINSTANCE.getHTTPHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HEADER__NAME = eINSTANCE.getHTTPHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HEADER__VALUE = eINSTANCE.getHTTPHeader_Value();

		/**
		 * The meta object literal for the '{@link k8s.impl.VolumeMountImpl <em>Volume Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.VolumeMountImpl
		 * @see k8s.impl.K8sPackageImpl#getVolumeMount()
		 * @generated
		 */
		EClass VOLUME_MOUNT = eINSTANCE.getVolumeMount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__NAME = eINSTANCE.getVolumeMount_Name();

		/**
		 * The meta object literal for the '<em><b>Mount Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__MOUNT_PATH = eINSTANCE.getVolumeMount_MountPath();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__READ_ONLY = eINSTANCE.getVolumeMount_ReadOnly();

		/**
		 * The meta object literal for the '{@link k8s.impl.HTTPGetActionImpl <em>HTTP Get Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.HTTPGetActionImpl
		 * @see k8s.impl.K8sPackageImpl#getHTTPGetAction()
		 * @generated
		 */
		EClass HTTP_GET_ACTION = eINSTANCE.getHTTPGetAction();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_GET_ACTION__PATH = eINSTANCE.getHTTPGetAction_Path();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_GET_ACTION__PORT = eINSTANCE.getHTTPGetAction_Port();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_GET_ACTION__SCHEME = eINSTANCE.getHTTPGetAction_Scheme();

		/**
		 * The meta object literal for the '<em><b>Http Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_GET_ACTION__HTTP_HEADERS = eINSTANCE.getHTTPGetAction_HttpHeaders();

		/**
		 * The meta object literal for the '{@link k8s.impl.ProbeImpl <em>Probe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ProbeImpl
		 * @see k8s.impl.K8sPackageImpl#getProbe()
		 * @generated
		 */
		EClass PROBE = eINSTANCE.getProbe();

		/**
		 * The meta object literal for the '<em><b>Http Get</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE__HTTP_GET = eINSTANCE.getProbe_HttpGet();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBE__EXEC = eINSTANCE.getProbe_Exec();

		/**
		 * The meta object literal for the '<em><b>Initial Delay Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__INITIAL_DELAY_SECONDS = eINSTANCE.getProbe_InitialDelaySeconds();

		/**
		 * The meta object literal for the '<em><b>Timeout Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBE__TIMEOUT_SECONDS = eINSTANCE.getProbe_TimeoutSeconds();

		/**
		 * The meta object literal for the '{@link k8s.impl.ExecActionImpl <em>Exec Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.ExecActionImpl
		 * @see k8s.impl.K8sPackageImpl#getExecAction()
		 * @generated
		 */
		EClass EXEC_ACTION = eINSTANCE.getExecAction();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_ACTION__COMMAND = eINSTANCE.getExecAction_Command();

		/**
		 * The meta object literal for the '{@link k8s.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.HandlerImpl
		 * @see k8s.impl.K8sPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__EXEC = eINSTANCE.getHandler_Exec();

		/**
		 * The meta object literal for the '{@link k8s.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.LifeCycleImpl
		 * @see k8s.impl.K8sPackageImpl#getLifeCycle()
		 * @generated
		 */
		EClass LIFE_CYCLE = eINSTANCE.getLifeCycle();

		/**
		 * The meta object literal for the '<em><b>Post Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_CYCLE__POST_START = eINSTANCE.getLifeCycle_PostStart();

		/**
		 * The meta object literal for the '<em><b>Pre Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_CYCLE__PRE_STOP = eINSTANCE.getLifeCycle_PreStop();

		/**
		 * The meta object literal for the '{@link k8s.impl.HostPathVolumeSourceImpl <em>Host Path Volume Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.HostPathVolumeSourceImpl
		 * @see k8s.impl.K8sPackageImpl#getHostPathVolumeSource()
		 * @generated
		 */
		EClass HOST_PATH_VOLUME_SOURCE = eINSTANCE.getHostPathVolumeSource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_PATH_VOLUME_SOURCE__PATH = eINSTANCE.getHostPathVolumeSource_Path();

		/**
		 * The meta object literal for the '{@link k8s.impl.NodeAffinityImpl <em>Node Affinity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.NodeAffinityImpl
		 * @see k8s.impl.K8sPackageImpl#getNodeAffinity()
		 * @generated
		 */
		EClass NODE_AFFINITY = eINSTANCE.getNodeAffinity();

		/**
		 * The meta object literal for the '<em><b>Required During Scheduling Ignored During Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION = eINSTANCE.getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution();

		/**
		 * The meta object literal for the '{@link k8s.impl.NodeSelectorImpl <em>Node Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.NodeSelectorImpl
		 * @see k8s.impl.K8sPackageImpl#getNodeSelector()
		 * @generated
		 */
		EClass NODE_SELECTOR = eINSTANCE.getNodeSelector();

		/**
		 * The meta object literal for the '<em><b>Node Selector Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTOR__NODE_SELECTOR_TERMS = eINSTANCE.getNodeSelector_NodeSelectorTerms();

		/**
		 * The meta object literal for the '{@link k8s.impl.NodeSelectorTermImpl <em>Node Selector Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.NodeSelectorTermImpl
		 * @see k8s.impl.K8sPackageImpl#getNodeSelectorTerm()
		 * @generated
		 */
		EClass NODE_SELECTOR_TERM = eINSTANCE.getNodeSelectorTerm();

		/**
		 * The meta object literal for the '<em><b>Match Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTOR_TERM__MATCH_EXPRESSIONS = eINSTANCE.getNodeSelectorTerm_MatchExpressions();

		/**
		 * The meta object literal for the '{@link k8s.impl.NodeSelectorRequirementImpl <em>Node Selector Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.NodeSelectorRequirementImpl
		 * @see k8s.impl.K8sPackageImpl#getNodeSelectorRequirement()
		 * @generated
		 */
		EClass NODE_SELECTOR_REQUIREMENT = eINSTANCE.getNodeSelectorRequirement();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTOR_REQUIREMENT__VALUES = eINSTANCE.getNodeSelectorRequirement_Values();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTOR_REQUIREMENT__KEY = eINSTANCE.getNodeSelectorRequirement_Key();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTOR_REQUIREMENT__OPERATOR = eINSTANCE.getNodeSelectorRequirement_Operator();

		/**
		 * The meta object literal for the '{@link k8s.impl.MymapImpl <em>Mymap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.impl.MymapImpl
		 * @see k8s.impl.K8sPackageImpl#getMymap()
		 * @generated
		 */
		EClass MYMAP = eINSTANCE.getMymap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MYMAP__KEY = eINSTANCE.getMymap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MYMAP__VALUE = eINSTANCE.getMymap_Value();

		/**
		 * The meta object literal for the '{@link k8s.ApiVersion <em>Api Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.ApiVersion
		 * @see k8s.impl.K8sPackageImpl#getApiVersion()
		 * @generated
		 */
		EEnum API_VERSION = eINSTANCE.getApiVersion();

		/**
		 * The meta object literal for the '{@link k8s.Kind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see k8s.Kind
		 * @see k8s.impl.K8sPackageImpl#getKind()
		 * @generated
		 */
		EEnum KIND = eINSTANCE.getKind();

	}

} //K8sPackage
