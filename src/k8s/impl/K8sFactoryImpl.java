/**
 */
package k8s.impl;

import k8s.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class K8sFactoryImpl extends EFactoryImpl implements K8sFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static K8sFactory init() {
		try {
			K8sFactory theK8sFactory = (K8sFactory)EPackage.Registry.INSTANCE.getEFactory(K8sPackage.eNS_URI);
			if (theK8sFactory != null) {
				return theK8sFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new K8sFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K8sFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case K8sPackage.METADATA: return createMetadata();
			case K8sPackage.MANIFEST: return createManifest();
			case K8sPackage.SPEC_FACTORY: return createSpecFactory();
			case K8sPackage.DEPLOYMENT: return createDeployment();
			case K8sPackage.POD: return createPod();
			case K8sPackage.POD_SPEC: return createPodSpec();
			case K8sPackage.DEPLOYMENT_SPEC: return createDeploymentSpec();
			case K8sPackage.DEPLOYMENT_STRATEGY: return createDeploymentStrategy();
			case K8sPackage.SELECTOR: return createSelector();
			case K8sPackage.POD_TEMPLATE: return createPodTemplate();
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT: return createTopologySpreadConstraint();
			case K8sPackage.CONTAINERS: return createContainers();
			case K8sPackage.VOLUME: return createVolume();
			case K8sPackage.AFFINITY: return createAffinity();
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT: return createRollingUpdateDeployment();
			case K8sPackage.LABEL_SELECTOR: return createLabelSelector();
			case K8sPackage.MATCH_EXPRESSIONS: return createMatchExpressions();
			case K8sPackage.CONTAINER_PORT: return createContainerPort();
			case K8sPackage.RESOURCE_REQUIREMENTS: return createResourceRequirements();
			case K8sPackage.ENV_VAR: return createEnvVar();
			case K8sPackage.ENV_VAR_SOURCE: return createEnvVarSource();
			case K8sPackage.SECRET_KEY_SELECTOR: return createSecretKeySelector();
			case K8sPackage.OBJECT_FIELD_SELECTOR: return createObjectFieldSelector();
			case K8sPackage.HTTP_HEADER: return createHTTPHeader();
			case K8sPackage.VOLUME_MOUNT: return createVolumeMount();
			case K8sPackage.HTTP_GET_ACTION: return createHTTPGetAction();
			case K8sPackage.PROBE: return createProbe();
			case K8sPackage.EXEC_ACTION: return createExecAction();
			case K8sPackage.HANDLER: return createHandler();
			case K8sPackage.LIFE_CYCLE: return createLifeCycle();
			case K8sPackage.HOST_PATH_VOLUME_SOURCE: return createHostPathVolumeSource();
			case K8sPackage.NODE_AFFINITY: return createNodeAffinity();
			case K8sPackage.NODE_SELECTOR: return createNodeSelector();
			case K8sPackage.NODE_SELECTOR_TERM: return createNodeSelectorTerm();
			case K8sPackage.NODE_SELECTOR_REQUIREMENT: return createNodeSelectorRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case K8sPackage.API_VERSION:
				return createApiVersionFromString(eDataType, initialValue);
			case K8sPackage.KIND:
				return createKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case K8sPackage.API_VERSION:
				return convertApiVersionToString(eDataType, instanceValue);
			case K8sPackage.KIND:
				return convertKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest createManifest() {
		ManifestImpl manifest = new ManifestImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactory createSpecFactory() {
		SpecFactoryImpl specFactory = new SpecFactoryImpl();
		return specFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod createPod() {
		PodImpl pod = new PodImpl();
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodSpec createPodSpec() {
		PodSpecImpl podSpec = new PodSpecImpl();
		return podSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpec createDeploymentSpec() {
		DeploymentSpecImpl deploymentSpec = new DeploymentSpecImpl();
		return deploymentSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStrategy createDeploymentStrategy() {
		DeploymentStrategyImpl deploymentStrategy = new DeploymentStrategyImpl();
		return deploymentStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector createSelector() {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodTemplate createPodTemplate() {
		PodTemplateImpl podTemplate = new PodTemplateImpl();
		return podTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologySpreadConstraint createTopologySpreadConstraint() {
		TopologySpreadConstraintImpl topologySpreadConstraint = new TopologySpreadConstraintImpl();
		return topologySpreadConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containers createContainers() {
		ContainersImpl containers = new ContainersImpl();
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affinity createAffinity() {
		AffinityImpl affinity = new AffinityImpl();
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollingUpdateDeployment createRollingUpdateDeployment() {
		RollingUpdateDeploymentImpl rollingUpdateDeployment = new RollingUpdateDeploymentImpl();
		return rollingUpdateDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelSelector createLabelSelector() {
		LabelSelectorImpl labelSelector = new LabelSelectorImpl();
		return labelSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchExpressions createMatchExpressions() {
		MatchExpressionsImpl matchExpressions = new MatchExpressionsImpl();
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPort createContainerPort() {
		ContainerPortImpl containerPort = new ContainerPortImpl();
		return containerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequirements createResourceRequirements() {
		ResourceRequirementsImpl resourceRequirements = new ResourceRequirementsImpl();
		return resourceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVar createEnvVar() {
		EnvVarImpl envVar = new EnvVarImpl();
		return envVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVarSource createEnvVarSource() {
		EnvVarSourceImpl envVarSource = new EnvVarSourceImpl();
		return envVarSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretKeySelector createSecretKeySelector() {
		SecretKeySelectorImpl secretKeySelector = new SecretKeySelectorImpl();
		return secretKeySelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFieldSelector createObjectFieldSelector() {
		ObjectFieldSelectorImpl objectFieldSelector = new ObjectFieldSelectorImpl();
		return objectFieldSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPHeader createHTTPHeader() {
		HTTPHeaderImpl httpHeader = new HTTPHeaderImpl();
		return httpHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeMount createVolumeMount() {
		VolumeMountImpl volumeMount = new VolumeMountImpl();
		return volumeMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPGetAction createHTTPGetAction() {
		HTTPGetActionImpl httpGetAction = new HTTPGetActionImpl();
		return httpGetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probe createProbe() {
		ProbeImpl probe = new ProbeImpl();
		return probe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecAction createExecAction() {
		ExecActionImpl execAction = new ExecActionImpl();
		return execAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler createHandler() {
		HandlerImpl handler = new HandlerImpl();
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycle createLifeCycle() {
		LifeCycleImpl lifeCycle = new LifeCycleImpl();
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostPathVolumeSource createHostPathVolumeSource() {
		HostPathVolumeSourceImpl hostPathVolumeSource = new HostPathVolumeSourceImpl();
		return hostPathVolumeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAffinity createNodeAffinity() {
		NodeAffinityImpl nodeAffinity = new NodeAffinityImpl();
		return nodeAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelector createNodeSelector() {
		NodeSelectorImpl nodeSelector = new NodeSelectorImpl();
		return nodeSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelectorTerm createNodeSelectorTerm() {
		NodeSelectorTermImpl nodeSelectorTerm = new NodeSelectorTermImpl();
		return nodeSelectorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelectorRequirement createNodeSelectorRequirement() {
		NodeSelectorRequirementImpl nodeSelectorRequirement = new NodeSelectorRequirementImpl();
		return nodeSelectorRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiVersion createApiVersionFromString(EDataType eDataType, String initialValue) {
		ApiVersion result = ApiVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind createKindFromString(EDataType eDataType, String initialValue) {
		Kind result = Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K8sPackage getK8sPackage() {
		return (K8sPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static K8sPackage getPackage() {
		return K8sPackage.eINSTANCE;
	}

} //K8sFactoryImpl
