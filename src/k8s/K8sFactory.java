/**
 */
package k8s;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see k8s.K8sPackage
 * @generated
 */
public interface K8sFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	K8sFactory eINSTANCE = k8s.impl.K8sFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifest</em>'.
	 * @generated
	 */
	Manifest createManifest();

	/**
	 * Returns a new object of class '<em>Spec Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Factory</em>'.
	 * @generated
	 */
	SpecFactory createSpecFactory();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Pod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pod</em>'.
	 * @generated
	 */
	Pod createPod();

	/**
	 * Returns a new object of class '<em>Pod Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pod Spec</em>'.
	 * @generated
	 */
	PodSpec createPodSpec();

	/**
	 * Returns a new object of class '<em>Deployment Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Spec</em>'.
	 * @generated
	 */
	DeploymentSpec createDeploymentSpec();

	/**
	 * Returns a new object of class '<em>Deployment Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Strategy</em>'.
	 * @generated
	 */
	DeploymentStrategy createDeploymentStrategy();

	/**
	 * Returns a new object of class '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector</em>'.
	 * @generated
	 */
	Selector createSelector();

	/**
	 * Returns a new object of class '<em>Pod Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pod Template</em>'.
	 * @generated
	 */
	PodTemplate createPodTemplate();

	/**
	 * Returns a new object of class '<em>Topology Spread Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Spread Constraint</em>'.
	 * @generated
	 */
	TopologySpreadConstraint createTopologySpreadConstraint();

	/**
	 * Returns a new object of class '<em>Containers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containers</em>'.
	 * @generated
	 */
	Containers createContainers();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Affinity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affinity</em>'.
	 * @generated
	 */
	Affinity createAffinity();

	/**
	 * Returns a new object of class '<em>Rolling Update Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rolling Update Deployment</em>'.
	 * @generated
	 */
	RollingUpdateDeployment createRollingUpdateDeployment();

	/**
	 * Returns a new object of class '<em>Label Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Selector</em>'.
	 * @generated
	 */
	LabelSelector createLabelSelector();

	/**
	 * Returns a new object of class '<em>Match Expressions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Expressions</em>'.
	 * @generated
	 */
	MatchExpressions createMatchExpressions();

	/**
	 * Returns a new object of class '<em>Container Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Port</em>'.
	 * @generated
	 */
	ContainerPort createContainerPort();

	/**
	 * Returns a new object of class '<em>Resource Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirements</em>'.
	 * @generated
	 */
	ResourceRequirements createResourceRequirements();

	/**
	 * Returns a new object of class '<em>Env Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Var</em>'.
	 * @generated
	 */
	EnvVar createEnvVar();

	/**
	 * Returns a new object of class '<em>Env Var Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Var Source</em>'.
	 * @generated
	 */
	EnvVarSource createEnvVarSource();

	/**
	 * Returns a new object of class '<em>Secret Key Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret Key Selector</em>'.
	 * @generated
	 */
	SecretKeySelector createSecretKeySelector();

	/**
	 * Returns a new object of class '<em>Object Field Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Field Selector</em>'.
	 * @generated
	 */
	ObjectFieldSelector createObjectFieldSelector();

	/**
	 * Returns a new object of class '<em>HTTP Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Header</em>'.
	 * @generated
	 */
	HTTPHeader createHTTPHeader();

	/**
	 * Returns a new object of class '<em>Volume Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Mount</em>'.
	 * @generated
	 */
	VolumeMount createVolumeMount();

	/**
	 * Returns a new object of class '<em>HTTP Get Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Get Action</em>'.
	 * @generated
	 */
	HTTPGetAction createHTTPGetAction();

	/**
	 * Returns a new object of class '<em>Probe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probe</em>'.
	 * @generated
	 */
	Probe createProbe();

	/**
	 * Returns a new object of class '<em>Exec Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Action</em>'.
	 * @generated
	 */
	ExecAction createExecAction();

	/**
	 * Returns a new object of class '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handler</em>'.
	 * @generated
	 */
	Handler createHandler();

	/**
	 * Returns a new object of class '<em>Life Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Cycle</em>'.
	 * @generated
	 */
	LifeCycle createLifeCycle();

	/**
	 * Returns a new object of class '<em>Host Path Volume Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Path Volume Source</em>'.
	 * @generated
	 */
	HostPathVolumeSource createHostPathVolumeSource();

	/**
	 * Returns a new object of class '<em>Node Affinity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Affinity</em>'.
	 * @generated
	 */
	NodeAffinity createNodeAffinity();

	/**
	 * Returns a new object of class '<em>Node Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Selector</em>'.
	 * @generated
	 */
	NodeSelector createNodeSelector();

	/**
	 * Returns a new object of class '<em>Node Selector Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Selector Term</em>'.
	 * @generated
	 */
	NodeSelectorTerm createNodeSelectorTerm();

	/**
	 * Returns a new object of class '<em>Node Selector Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Selector Requirement</em>'.
	 * @generated
	 */
	NodeSelectorRequirement createNodeSelectorRequirement();

	/**
	 * Returns a new object of class '<em>Mymap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mymap</em>'.
	 * @generated
	 */
	Mymap createMymap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	K8sPackage getK8sPackage();

} //K8sFactory
