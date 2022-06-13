/**
 */
package k8s.impl;

import k8s.Affinity;
import k8s.ApiVersion;
import k8s.ContainerPort;
import k8s.Containers;
import k8s.DeploymentSpec;
import k8s.DeploymentStrategy;
import k8s.EnvVar;
import k8s.EnvVarSource;
import k8s.ExecAction;
import k8s.HTTPGetAction;
import k8s.HTTPHeader;
import k8s.Handler;
import k8s.HostPathVolumeSource;
import k8s.K8sFactory;
import k8s.K8sPackage;
import k8s.Kind;
import k8s.LabelSelector;
import k8s.LifeCycle;
import k8s.Manifest;
import k8s.MatchExpressions;
import k8s.Metadata;
import k8s.Mymap;
import k8s.NodeAffinity;
import k8s.NodeSelector;
import k8s.NodeSelectorRequirement;
import k8s.NodeSelectorTerm;
import k8s.ObjectFieldSelector;
import k8s.PodSpec;
import k8s.PodTemplate;
import k8s.Probe;
import k8s.ResourceRequirements;
import k8s.RollingUpdateDeployment;
import k8s.SecretKeySelector;
import k8s.Selector;
import k8s.Spec;
import k8s.TopologySpreadConstraint;
import k8s.Volume;
import k8s.VolumeMount;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class K8sPackageImpl extends EPackageImpl implements K8sPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologySpreadConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affinityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rollingUpdateDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchExpressionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretKeySelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFieldSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeMountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpGetActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeCycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostPathVolumeSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeAffinityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSelectorTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSelectorRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mymapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see k8s.K8sPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private K8sPackageImpl() {
		super(eNS_URI, K8sFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link K8sPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static K8sPackage init() {
		if (isInited) return (K8sPackage)EPackage.Registry.INSTANCE.getEPackage(K8sPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredK8sPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		K8sPackageImpl theK8sPackage = registeredK8sPackage instanceof K8sPackageImpl ? (K8sPackageImpl)registeredK8sPackage : new K8sPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theK8sPackage.createPackageContents();

		// Initialize created meta-data
		theK8sPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theK8sPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(K8sPackage.eNS_URI, theK8sPackage);
		return theK8sPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifest() {
		return manifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_ApiVersion() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifest_Kind() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifest_Metadata() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifest_Spec() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Name() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Namespace() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Labels() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Annotations() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpec() {
		return specEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPodSpec() {
		return podSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPodSpec_RestartPolicy() {
		return (EAttribute)podSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodSpec_Affinity() {
		return (EReference)podSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodSpec_Containers() {
		return (EReference)podSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodSpec_Volumes() {
		return (EReference)podSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodSpec_TopologySpreadConstraints() {
		return (EReference)podSpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodSpec_InitContainers() {
		return (EReference)podSpecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpec() {
		return deploymentSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpec_Selector() {
		return (EReference)deploymentSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpec_Strategy() {
		return (EReference)deploymentSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpec_Template() {
		return (EReference)deploymentSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentStrategy() {
		return deploymentStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentStrategy_Type() {
		return (EAttribute)deploymentStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentStrategy_RollingUpdate() {
		return (EReference)deploymentStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_MatchExpressions() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_MatchLabels() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPodTemplate() {
		return podTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodTemplate_Metadata() {
		return (EReference)podTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPodTemplate_Spec() {
		return (EReference)podTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologySpreadConstraint() {
		return topologySpreadConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologySpreadConstraint_LabelSelector() {
		return (EReference)topologySpreadConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologySpreadConstraint_TopologyKey() {
		return (EAttribute)topologySpreadConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologySpreadConstraint_WhenUnsatisfiable() {
		return (EAttribute)topologySpreadConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologySpreadConstraint_MaxSkew() {
		return (EAttribute)topologySpreadConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainers() {
		return containersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainers_Name() {
		return (EAttribute)containersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainers_Image() {
		return (EAttribute)containersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainers_LiveRestart() {
		return (EAttribute)containersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainers_Command() {
		return (EAttribute)containersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainers_Args() {
		return (EAttribute)containersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_Resources() {
		return (EReference)containersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_LivenessProbe() {
		return (EReference)containersEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_ReadinessProbe() {
		return (EReference)containersEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_LifeCycle() {
		return (EReference)containersEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_VolumeMounts() {
		return (EReference)containersEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_Env() {
		return (EReference)containersEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainers_Ports() {
		return (EReference)containersEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolume_HostPath() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffinity() {
		return affinityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffinity_NodeAffinity() {
		return (EReference)affinityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRollingUpdateDeployment() {
		return rollingUpdateDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRollingUpdateDeployment_MaxUnavailable() {
		return (EAttribute)rollingUpdateDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRollingUpdateDeployment_MaxSurge() {
		return (EAttribute)rollingUpdateDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelSelector() {
		return labelSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelSelector_MatchExpressions() {
		return (EReference)labelSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelSelector_MatchLabels() {
		return (EReference)labelSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchExpressions() {
		return matchExpressionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchExpressions_Key() {
		return (EAttribute)matchExpressionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchExpressions_Values() {
		return (EAttribute)matchExpressionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchExpressions_Operator() {
		return (EAttribute)matchExpressionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerPort() {
		return containerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPort_Name() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPort_Protocol() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPort_HostPort() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPort_ContainerPort() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRequirements() {
		return resourceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRequirements_Limits() {
		return (EReference)resourceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRequirements_Requests() {
		return (EReference)resourceRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVar() {
		return envVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Name() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVar_Value() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvVar_ValueFrom() {
		return (EReference)envVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVarSource() {
		return envVarSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvVarSource_FieldRef() {
		return (EReference)envVarSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvVarSource_SecretKeyRef() {
		return (EReference)envVarSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretKeySelector() {
		return secretKeySelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretKeySelector_Name() {
		return (EAttribute)secretKeySelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretKeySelector_Key() {
		return (EAttribute)secretKeySelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFieldSelector() {
		return objectFieldSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFieldSelector_ApiVersion() {
		return (EAttribute)objectFieldSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFieldSelector_FieldPath() {
		return (EAttribute)objectFieldSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPHeader() {
		return httpHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPHeader_Name() {
		return (EAttribute)httpHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPHeader_Value() {
		return (EAttribute)httpHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeMount() {
		return volumeMountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeMount_Name() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeMount_MountPath() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeMount_ReadOnly() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPGetAction() {
		return httpGetActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPGetAction_Path() {
		return (EAttribute)httpGetActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPGetAction_Port() {
		return (EAttribute)httpGetActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPGetAction_Scheme() {
		return (EAttribute)httpGetActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPGetAction_HttpHeaders() {
		return (EAttribute)httpGetActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbe() {
		return probeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbe_HttpGet() {
		return (EReference)probeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbe_Exec() {
		return (EReference)probeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_InitialDelaySeconds() {
		return (EAttribute)probeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbe_TimeoutSeconds() {
		return (EAttribute)probeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecAction() {
		return execActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecAction_Command() {
		return (EAttribute)execActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandler() {
		return handlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandler_Exec() {
		return (EReference)handlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeCycle() {
		return lifeCycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeCycle_PostStart() {
		return (EReference)lifeCycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeCycle_PreStop() {
		return (EReference)lifeCycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostPathVolumeSource() {
		return hostPathVolumeSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHostPathVolumeSource_Path() {
		return (EAttribute)hostPathVolumeSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeAffinity() {
		return nodeAffinityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution() {
		return (EReference)nodeAffinityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSelector() {
		return nodeSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSelector_NodeSelectorTerms() {
		return (EReference)nodeSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSelectorTerm() {
		return nodeSelectorTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSelectorTerm_MatchExpressions() {
		return (EReference)nodeSelectorTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSelectorRequirement() {
		return nodeSelectorRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelectorRequirement_Values() {
		return (EAttribute)nodeSelectorRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelectorRequirement_Key() {
		return (EAttribute)nodeSelectorRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelectorRequirement_Operator() {
		return (EAttribute)nodeSelectorRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMymap() {
		return mymapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMymap_Key() {
		return (EAttribute)mymapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMymap_Value() {
		return (EAttribute)mymapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiVersion() {
		return apiVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind() {
		return kindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K8sFactory getK8sFactory() {
		return (K8sFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		manifestEClass = createEClass(MANIFEST);
		createEAttribute(manifestEClass, MANIFEST__API_VERSION);
		createEAttribute(manifestEClass, MANIFEST__KIND);
		createEReference(manifestEClass, MANIFEST__METADATA);
		createEReference(manifestEClass, MANIFEST__SPEC);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__NAME);
		createEAttribute(metadataEClass, METADATA__NAMESPACE);
		createEReference(metadataEClass, METADATA__LABELS);
		createEReference(metadataEClass, METADATA__ANNOTATIONS);

		specEClass = createEClass(SPEC);

		podSpecEClass = createEClass(POD_SPEC);
		createEAttribute(podSpecEClass, POD_SPEC__RESTART_POLICY);
		createEReference(podSpecEClass, POD_SPEC__AFFINITY);
		createEReference(podSpecEClass, POD_SPEC__CONTAINERS);
		createEReference(podSpecEClass, POD_SPEC__VOLUMES);
		createEReference(podSpecEClass, POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS);
		createEReference(podSpecEClass, POD_SPEC__INIT_CONTAINERS);

		deploymentSpecEClass = createEClass(DEPLOYMENT_SPEC);
		createEReference(deploymentSpecEClass, DEPLOYMENT_SPEC__SELECTOR);
		createEReference(deploymentSpecEClass, DEPLOYMENT_SPEC__STRATEGY);
		createEReference(deploymentSpecEClass, DEPLOYMENT_SPEC__TEMPLATE);

		deploymentStrategyEClass = createEClass(DEPLOYMENT_STRATEGY);
		createEAttribute(deploymentStrategyEClass, DEPLOYMENT_STRATEGY__TYPE);
		createEReference(deploymentStrategyEClass, DEPLOYMENT_STRATEGY__ROLLING_UPDATE);

		selectorEClass = createEClass(SELECTOR);
		createEReference(selectorEClass, SELECTOR__MATCH_EXPRESSIONS);
		createEReference(selectorEClass, SELECTOR__MATCH_LABELS);

		podTemplateEClass = createEClass(POD_TEMPLATE);
		createEReference(podTemplateEClass, POD_TEMPLATE__METADATA);
		createEReference(podTemplateEClass, POD_TEMPLATE__SPEC);

		topologySpreadConstraintEClass = createEClass(TOPOLOGY_SPREAD_CONSTRAINT);
		createEReference(topologySpreadConstraintEClass, TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR);
		createEAttribute(topologySpreadConstraintEClass, TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY);
		createEAttribute(topologySpreadConstraintEClass, TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE);
		createEAttribute(topologySpreadConstraintEClass, TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW);

		containersEClass = createEClass(CONTAINERS);
		createEAttribute(containersEClass, CONTAINERS__NAME);
		createEAttribute(containersEClass, CONTAINERS__IMAGE);
		createEAttribute(containersEClass, CONTAINERS__LIVE_RESTART);
		createEAttribute(containersEClass, CONTAINERS__COMMAND);
		createEAttribute(containersEClass, CONTAINERS__ARGS);
		createEReference(containersEClass, CONTAINERS__RESOURCES);
		createEReference(containersEClass, CONTAINERS__LIVENESS_PROBE);
		createEReference(containersEClass, CONTAINERS__READINESS_PROBE);
		createEReference(containersEClass, CONTAINERS__LIFE_CYCLE);
		createEReference(containersEClass, CONTAINERS__VOLUME_MOUNTS);
		createEReference(containersEClass, CONTAINERS__ENV);
		createEReference(containersEClass, CONTAINERS__PORTS);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__NAME);
		createEReference(volumeEClass, VOLUME__HOST_PATH);

		affinityEClass = createEClass(AFFINITY);
		createEReference(affinityEClass, AFFINITY__NODE_AFFINITY);

		rollingUpdateDeploymentEClass = createEClass(ROLLING_UPDATE_DEPLOYMENT);
		createEAttribute(rollingUpdateDeploymentEClass, ROLLING_UPDATE_DEPLOYMENT__MAX_UNAVAILABLE);
		createEAttribute(rollingUpdateDeploymentEClass, ROLLING_UPDATE_DEPLOYMENT__MAX_SURGE);

		labelSelectorEClass = createEClass(LABEL_SELECTOR);
		createEReference(labelSelectorEClass, LABEL_SELECTOR__MATCH_EXPRESSIONS);
		createEReference(labelSelectorEClass, LABEL_SELECTOR__MATCH_LABELS);

		matchExpressionsEClass = createEClass(MATCH_EXPRESSIONS);
		createEAttribute(matchExpressionsEClass, MATCH_EXPRESSIONS__KEY);
		createEAttribute(matchExpressionsEClass, MATCH_EXPRESSIONS__VALUES);
		createEAttribute(matchExpressionsEClass, MATCH_EXPRESSIONS__OPERATOR);

		containerPortEClass = createEClass(CONTAINER_PORT);
		createEAttribute(containerPortEClass, CONTAINER_PORT__NAME);
		createEAttribute(containerPortEClass, CONTAINER_PORT__PROTOCOL);
		createEAttribute(containerPortEClass, CONTAINER_PORT__HOST_PORT);
		createEAttribute(containerPortEClass, CONTAINER_PORT__CONTAINER_PORT);

		resourceRequirementsEClass = createEClass(RESOURCE_REQUIREMENTS);
		createEReference(resourceRequirementsEClass, RESOURCE_REQUIREMENTS__LIMITS);
		createEReference(resourceRequirementsEClass, RESOURCE_REQUIREMENTS__REQUESTS);

		envVarEClass = createEClass(ENV_VAR);
		createEAttribute(envVarEClass, ENV_VAR__NAME);
		createEAttribute(envVarEClass, ENV_VAR__VALUE);
		createEReference(envVarEClass, ENV_VAR__VALUE_FROM);

		envVarSourceEClass = createEClass(ENV_VAR_SOURCE);
		createEReference(envVarSourceEClass, ENV_VAR_SOURCE__FIELD_REF);
		createEReference(envVarSourceEClass, ENV_VAR_SOURCE__SECRET_KEY_REF);

		secretKeySelectorEClass = createEClass(SECRET_KEY_SELECTOR);
		createEAttribute(secretKeySelectorEClass, SECRET_KEY_SELECTOR__NAME);
		createEAttribute(secretKeySelectorEClass, SECRET_KEY_SELECTOR__KEY);

		objectFieldSelectorEClass = createEClass(OBJECT_FIELD_SELECTOR);
		createEAttribute(objectFieldSelectorEClass, OBJECT_FIELD_SELECTOR__API_VERSION);
		createEAttribute(objectFieldSelectorEClass, OBJECT_FIELD_SELECTOR__FIELD_PATH);

		httpHeaderEClass = createEClass(HTTP_HEADER);
		createEAttribute(httpHeaderEClass, HTTP_HEADER__NAME);
		createEAttribute(httpHeaderEClass, HTTP_HEADER__VALUE);

		volumeMountEClass = createEClass(VOLUME_MOUNT);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__NAME);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__MOUNT_PATH);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__READ_ONLY);

		httpGetActionEClass = createEClass(HTTP_GET_ACTION);
		createEAttribute(httpGetActionEClass, HTTP_GET_ACTION__PATH);
		createEAttribute(httpGetActionEClass, HTTP_GET_ACTION__PORT);
		createEAttribute(httpGetActionEClass, HTTP_GET_ACTION__SCHEME);
		createEAttribute(httpGetActionEClass, HTTP_GET_ACTION__HTTP_HEADERS);

		probeEClass = createEClass(PROBE);
		createEReference(probeEClass, PROBE__HTTP_GET);
		createEReference(probeEClass, PROBE__EXEC);
		createEAttribute(probeEClass, PROBE__INITIAL_DELAY_SECONDS);
		createEAttribute(probeEClass, PROBE__TIMEOUT_SECONDS);

		execActionEClass = createEClass(EXEC_ACTION);
		createEAttribute(execActionEClass, EXEC_ACTION__COMMAND);

		handlerEClass = createEClass(HANDLER);
		createEReference(handlerEClass, HANDLER__EXEC);

		lifeCycleEClass = createEClass(LIFE_CYCLE);
		createEReference(lifeCycleEClass, LIFE_CYCLE__POST_START);
		createEReference(lifeCycleEClass, LIFE_CYCLE__PRE_STOP);

		hostPathVolumeSourceEClass = createEClass(HOST_PATH_VOLUME_SOURCE);
		createEAttribute(hostPathVolumeSourceEClass, HOST_PATH_VOLUME_SOURCE__PATH);

		nodeAffinityEClass = createEClass(NODE_AFFINITY);
		createEReference(nodeAffinityEClass, NODE_AFFINITY__REQUIRED_DURING_SCHEDULING_IGNORED_DURING_EXECUTION);

		nodeSelectorEClass = createEClass(NODE_SELECTOR);
		createEReference(nodeSelectorEClass, NODE_SELECTOR__NODE_SELECTOR_TERMS);

		nodeSelectorTermEClass = createEClass(NODE_SELECTOR_TERM);
		createEReference(nodeSelectorTermEClass, NODE_SELECTOR_TERM__MATCH_EXPRESSIONS);

		nodeSelectorRequirementEClass = createEClass(NODE_SELECTOR_REQUIREMENT);
		createEAttribute(nodeSelectorRequirementEClass, NODE_SELECTOR_REQUIREMENT__VALUES);
		createEAttribute(nodeSelectorRequirementEClass, NODE_SELECTOR_REQUIREMENT__KEY);
		createEAttribute(nodeSelectorRequirementEClass, NODE_SELECTOR_REQUIREMENT__OPERATOR);

		mymapEClass = createEClass(MYMAP);
		createEAttribute(mymapEClass, MYMAP__KEY);
		createEAttribute(mymapEClass, MYMAP__VALUE);

		// Create enums
		apiVersionEEnum = createEEnum(API_VERSION);
		kindEEnum = createEEnum(KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		podSpecEClass.getESuperTypes().add(this.getSpec());
		deploymentSpecEClass.getESuperTypes().add(this.getSpec());

		// Initialize classes, features, and operations; add parameters
		initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifest_ApiVersion(), this.getApiVersion(), "apiVersion", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifest_Kind(), this.getKind(), "kind", null, 1, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifest_Metadata(), this.getMetadata(), null, "metadata", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifest_Spec(), this.getSpec(), null, "spec", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Name(), ecorePackage.getEString(), "name", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Namespace(), ecorePackage.getEString(), "namespace", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Labels(), this.getMymap(), null, "labels", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Annotations(), this.getMymap(), null, "annotations", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specEClass, Spec.class, "Spec", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(podSpecEClass, PodSpec.class, "PodSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPodSpec_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodSpec_Affinity(), this.getAffinity(), null, "affinity", null, 0, 1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodSpec_Containers(), this.getContainers(), null, "containers", null, 0, -1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodSpec_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodSpec_TopologySpreadConstraints(), this.getTopologySpreadConstraint(), null, "topologySpreadConstraints", null, 0, -1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodSpec_InitContainers(), this.getContainers(), null, "initContainers", null, 0, -1, PodSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentSpecEClass, DeploymentSpec.class, "DeploymentSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentSpec_Selector(), this.getSelector(), null, "selector", null, 0, 1, DeploymentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpec_Strategy(), this.getDeploymentStrategy(), null, "strategy", null, 1, 1, DeploymentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentSpec_Template(), this.getPodTemplate(), null, "template", null, 1, 1, DeploymentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentStrategyEClass, DeploymentStrategy.class, "DeploymentStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentStrategy_Type(), ecorePackage.getEString(), "type", null, 1, 1, DeploymentStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentStrategy_RollingUpdate(), this.getRollingUpdateDeployment(), null, "rollingUpdate", null, 1, 1, DeploymentStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelector_MatchExpressions(), this.getMatchExpressions(), null, "matchExpressions", null, 0, -1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelector_MatchLabels(), this.getMymap(), null, "matchLabels", null, 0, 1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(podTemplateEClass, PodTemplate.class, "PodTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPodTemplate_Metadata(), this.getMetadata(), null, "metadata", null, 1, 1, PodTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplate_Spec(), this.getPodSpec(), null, "spec", null, 1, 1, PodTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologySpreadConstraintEClass, TopologySpreadConstraint.class, "TopologySpreadConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologySpreadConstraint_LabelSelector(), this.getLabelSelector(), null, "labelSelector", null, 1, 1, TopologySpreadConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologySpreadConstraint_TopologyKey(), ecorePackage.getEString(), "topologyKey", null, 0, 1, TopologySpreadConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologySpreadConstraint_WhenUnsatisfiable(), ecorePackage.getEString(), "whenUnsatisfiable", null, 0, 1, TopologySpreadConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologySpreadConstraint_MaxSkew(), ecorePackage.getEInt(), "maxSkew", null, 0, 1, TopologySpreadConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containersEClass, Containers.class, "Containers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainers_Name(), ecorePackage.getEString(), "name", null, 1, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainers_Image(), ecorePackage.getEString(), "image", null, 1, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainers_LiveRestart(), ecorePackage.getEBoolean(), "liveRestart", null, 0, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainers_Command(), ecorePackage.getEString(), "command", null, 0, -1, Containers.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainers_Args(), ecorePackage.getEString(), "args", null, 0, -1, Containers.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_Resources(), this.getResourceRequirements(), null, "resources", null, 0, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_LivenessProbe(), this.getProbe(), null, "livenessProbe", null, 0, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_ReadinessProbe(), this.getProbe(), null, "readinessProbe", null, 0, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_LifeCycle(), this.getLifeCycle(), null, "lifeCycle", null, 0, 1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_VolumeMounts(), this.getVolumeMount(), null, "volumeMounts", null, 0, -1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_Env(), this.getEnvVar(), null, "env", null, 0, -1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainers_Ports(), this.getContainerPort(), null, "ports", null, 0, -1, Containers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Name(), ecorePackage.getEString(), "name", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_HostPath(), this.getHostPathVolumeSource(), null, "hostPath", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affinityEClass, Affinity.class, "Affinity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffinity_NodeAffinity(), this.getNodeAffinity(), null, "nodeAffinity", null, 1, 1, Affinity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rollingUpdateDeploymentEClass, RollingUpdateDeployment.class, "RollingUpdateDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRollingUpdateDeployment_MaxUnavailable(), ecorePackage.getEInt(), "maxUnavailable", null, 1, 1, RollingUpdateDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRollingUpdateDeployment_MaxSurge(), ecorePackage.getEInt(), "maxSurge", null, 1, 1, RollingUpdateDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelSelectorEClass, LabelSelector.class, "LabelSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelSelector_MatchExpressions(), this.getMatchExpressions(), null, "matchExpressions", null, 0, -1, LabelSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabelSelector_MatchLabels(), this.getMymap(), null, "matchLabels", null, 0, 1, LabelSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchExpressionsEClass, MatchExpressions.class, "MatchExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchExpressions_Key(), ecorePackage.getEString(), "key", null, 1, 1, MatchExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchExpressions_Values(), ecorePackage.getEString(), "values", null, 1, -1, MatchExpressions.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchExpressions_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, MatchExpressions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerPortEClass, ContainerPort.class, "ContainerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_HostPort(), ecorePackage.getEInt(), "hostPort", null, 1, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_ContainerPort(), ecorePackage.getEInt(), "containerPort", null, 1, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementsEClass, ResourceRequirements.class, "ResourceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRequirements_Limits(), this.getMymap(), null, "limits", null, 0, 1, ResourceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRequirements_Requests(), this.getMymap(), null, "requests", null, 0, 1, ResourceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarEClass, EnvVar.class, "EnvVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVar_Value(), ecorePackage.getEInt(), "value", null, 1, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvVar_ValueFrom(), this.getEnvVarSource(), null, "valueFrom", null, 1, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarSourceEClass, EnvVarSource.class, "EnvVarSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvVarSource_FieldRef(), this.getSecretKeySelector(), null, "fieldRef", null, 1, 1, EnvVarSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvVarSource_SecretKeyRef(), this.getObjectFieldSelector(), null, "secretKeyRef", null, 1, 1, EnvVarSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretKeySelectorEClass, SecretKeySelector.class, "SecretKeySelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecretKeySelector_Name(), ecorePackage.getEString(), "name", null, 1, 1, SecretKeySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecretKeySelector_Key(), ecorePackage.getEString(), "key", null, 1, 1, SecretKeySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectFieldSelectorEClass, ObjectFieldSelector.class, "ObjectFieldSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectFieldSelector_ApiVersion(), this.getApiVersion(), "apiVersion", null, 1, 1, ObjectFieldSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectFieldSelector_FieldPath(), ecorePackage.getEString(), "fieldPath", null, 1, 1, ObjectFieldSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpHeaderEClass, HTTPHeader.class, "HTTPHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, HTTPHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPHeader_Value(), ecorePackage.getEString(), "value", null, 1, 1, HTTPHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeMountEClass, VolumeMount.class, "VolumeMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeMount_Name(), ecorePackage.getEString(), "name", null, 1, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeMount_MountPath(), ecorePackage.getEString(), "mountPath", null, 1, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeMount_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpGetActionEClass, HTTPGetAction.class, "HTTPGetAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPGetAction_Path(), ecorePackage.getEString(), "path", null, 1, 1, HTTPGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPGetAction_Port(), ecorePackage.getEInt(), "port", null, 1, 1, HTTPGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPGetAction_Scheme(), ecorePackage.getEString(), "scheme", null, 0, 1, HTTPGetAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPGetAction_HttpHeaders(), ecorePackage.getEString(), "httpHeaders", null, 0, -1, HTTPGetAction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probeEClass, Probe.class, "Probe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbe_HttpGet(), this.getHTTPGetAction(), null, "httpGet", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbe_Exec(), this.getExecAction(), null, "exec", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbe_InitialDelaySeconds(), ecorePackage.getEInt(), "initialDelaySeconds", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbe_TimeoutSeconds(), ecorePackage.getEInt(), "timeoutSeconds", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execActionEClass, ExecAction.class, "ExecAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecAction_Command(), ecorePackage.getEString(), "command", null, 1, -1, ExecAction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandler_Exec(), this.getExecAction(), null, "exec", null, 1, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeCycle_PostStart(), this.getHandler(), null, "postStart", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeCycle_PreStop(), this.getHandler(), null, "preStop", null, 0, 1, LifeCycle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostPathVolumeSourceEClass, HostPathVolumeSource.class, "HostPathVolumeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHostPathVolumeSource_Path(), ecorePackage.getEString(), "path", null, 1, 1, HostPathVolumeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeAffinityEClass, NodeAffinity.class, "NodeAffinity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution(), this.getNodeSelector(), null, "requiredDuringSchedulingIgnoredDuringExecution", null, 1, -1, NodeAffinity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSelectorEClass, NodeSelector.class, "NodeSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSelector_NodeSelectorTerms(), this.getNodeSelectorTerm(), null, "nodeSelectorTerms", null, 1, -1, NodeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSelectorTermEClass, NodeSelectorTerm.class, "NodeSelectorTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSelectorTerm_MatchExpressions(), this.getNodeSelectorRequirement(), null, "matchExpressions", null, 1, -1, NodeSelectorTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeSelectorRequirementEClass, NodeSelectorRequirement.class, "NodeSelectorRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeSelectorRequirement_Values(), ecorePackage.getEString(), "values", null, 1, -1, NodeSelectorRequirement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelectorRequirement_Key(), ecorePackage.getEString(), "key", null, 1, 1, NodeSelectorRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelectorRequirement_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, NodeSelectorRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mymapEClass, Mymap.class, "Mymap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMymap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Mymap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMymap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mymap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(apiVersionEEnum, ApiVersion.class, "ApiVersion");
		addEEnumLiteral(apiVersionEEnum, ApiVersion.V1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.CERTIFICATES_K8S_IO_V1BETA1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.RBAC_AUTHORIZATION_K8S_IO_V1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.APPS_V1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.BATCH_V1BETA1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.EXTENSIONS_V1BETA1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.AUTOSCALING_V1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.BATCH_V1);
		addEEnumLiteral(apiVersionEEnum, ApiVersion.POLICY_V1BETA1);

		initEEnum(kindEEnum, Kind.class, "Kind");
		addEEnumLiteral(kindEEnum, Kind.CERTIFICATE_SIGNING_REQUEST);
		addEEnumLiteral(kindEEnum, Kind.CLUSTER_ROLE_BINDING);
		addEEnumLiteral(kindEEnum, Kind.CLUSTER_ROLE);
		addEEnumLiteral(kindEEnum, Kind.COMPONENT_STATUS);
		addEEnumLiteral(kindEEnum, Kind.CONFIG_MAP);
		addEEnumLiteral(kindEEnum, Kind.CONTROLLER_REVISION);
		addEEnumLiteral(kindEEnum, Kind.CRON_JOB);
		addEEnumLiteral(kindEEnum, Kind.DAEMON_SET);
		addEEnumLiteral(kindEEnum, Kind.DEPLOYMENT);
		addEEnumLiteral(kindEEnum, Kind.ENDPOINTS);
		addEEnumLiteral(kindEEnum, Kind.EVENT);
		addEEnumLiteral(kindEEnum, Kind.HORIZONTAL_POD_AUTOSCALER);
		addEEnumLiteral(kindEEnum, Kind.INGRESS);
		addEEnumLiteral(kindEEnum, Kind.JOB);
		addEEnumLiteral(kindEEnum, Kind.LIMIT_RANGE);
		addEEnumLiteral(kindEEnum, Kind.NAMESPACE);
		addEEnumLiteral(kindEEnum, Kind.NETWORK_POLICY);
		addEEnumLiteral(kindEEnum, Kind.NODE);
		addEEnumLiteral(kindEEnum, Kind.PERSISTENT_VOLUME_CLAIM);
		addEEnumLiteral(kindEEnum, Kind.PERSISTENT_VOLUME);
		addEEnumLiteral(kindEEnum, Kind.POD_DISRUPTION_BUDGET);
		addEEnumLiteral(kindEEnum, Kind.POD);
		addEEnumLiteral(kindEEnum, Kind.POD_SECURITY_POLICY);
		addEEnumLiteral(kindEEnum, Kind.POD_TEMPLATE);
		addEEnumLiteral(kindEEnum, Kind.REPLICA_SET);
		addEEnumLiteral(kindEEnum, Kind.REPLICATION_CONTROLLER);
		addEEnumLiteral(kindEEnum, Kind.RESOURCE_QUOTA);
		addEEnumLiteral(kindEEnum, Kind.ROLE_BINDING);
		addEEnumLiteral(kindEEnum, Kind.ROLE);
		addEEnumLiteral(kindEEnum, Kind.SECRET);
		addEEnumLiteral(kindEEnum, Kind.SERVICE_ACCOUNT);
		addEEnumLiteral(kindEEnum, Kind.SERVICE);
		addEEnumLiteral(kindEEnum, Kind.STATEFUL_SET);

		// Create resource
		createResource(eNS_URI);
	}

} //K8sPackageImpl
