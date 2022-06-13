/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Containers#getName <em>Name</em>}</li>
 *   <li>{@link k8s.Containers#getImage <em>Image</em>}</li>
 *   <li>{@link k8s.Containers#isLiveRestart <em>Live Restart</em>}</li>
 *   <li>{@link k8s.Containers#getCommand <em>Command</em>}</li>
 *   <li>{@link k8s.Containers#getArgs <em>Args</em>}</li>
 *   <li>{@link k8s.Containers#getResources <em>Resources</em>}</li>
 *   <li>{@link k8s.Containers#getLivenessProbe <em>Liveness Probe</em>}</li>
 *   <li>{@link k8s.Containers#getReadinessProbe <em>Readiness Probe</em>}</li>
 *   <li>{@link k8s.Containers#getLifeCycle <em>Life Cycle</em>}</li>
 *   <li>{@link k8s.Containers#getVolumeMounts <em>Volume Mounts</em>}</li>
 *   <li>{@link k8s.Containers#getEnv <em>Env</em>}</li>
 *   <li>{@link k8s.Containers#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getContainers()
 * @model
 * @generated
 */
public interface Containers extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getContainers_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.Containers#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see k8s.K8sPackage#getContainers_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link k8s.Containers#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Live Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live Restart</em>' attribute.
	 * @see #setLiveRestart(boolean)
	 * @see k8s.K8sPackage#getContainers_LiveRestart()
	 * @model
	 * @generated
	 */
	boolean isLiveRestart();

	/**
	 * Sets the value of the '{@link k8s.Containers#isLiveRestart <em>Live Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Restart</em>' attribute.
	 * @see #isLiveRestart()
	 * @generated
	 */
	void setLiveRestart(boolean value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see k8s.K8sPackage#getContainers_Command()
	 * @model transient="true"
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see k8s.K8sPackage#getContainers_Args()
	 * @model transient="true"
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourceRequirements)
	 * @see k8s.K8sPackage#getContainers_Resources()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRequirements getResources();

	/**
	 * Sets the value of the '{@link k8s.Containers#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourceRequirements value);

	/**
	 * Returns the value of the '<em><b>Liveness Probe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liveness Probe</em>' containment reference.
	 * @see #setLivenessProbe(Probe)
	 * @see k8s.K8sPackage#getContainers_LivenessProbe()
	 * @model containment="true"
	 * @generated
	 */
	Probe getLivenessProbe();

	/**
	 * Sets the value of the '{@link k8s.Containers#getLivenessProbe <em>Liveness Probe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liveness Probe</em>' containment reference.
	 * @see #getLivenessProbe()
	 * @generated
	 */
	void setLivenessProbe(Probe value);

	/**
	 * Returns the value of the '<em><b>Readiness Probe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readiness Probe</em>' containment reference.
	 * @see #setReadinessProbe(Probe)
	 * @see k8s.K8sPackage#getContainers_ReadinessProbe()
	 * @model containment="true"
	 * @generated
	 */
	Probe getReadinessProbe();

	/**
	 * Sets the value of the '{@link k8s.Containers#getReadinessProbe <em>Readiness Probe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readiness Probe</em>' containment reference.
	 * @see #getReadinessProbe()
	 * @generated
	 */
	void setReadinessProbe(Probe value);

	/**
	 * Returns the value of the '<em><b>Life Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle</em>' containment reference.
	 * @see #setLifeCycle(LifeCycle)
	 * @see k8s.K8sPackage#getContainers_LifeCycle()
	 * @model containment="true"
	 * @generated
	 */
	LifeCycle getLifeCycle();

	/**
	 * Sets the value of the '{@link k8s.Containers#getLifeCycle <em>Life Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle</em>' containment reference.
	 * @see #getLifeCycle()
	 * @generated
	 */
	void setLifeCycle(LifeCycle value);

	/**
	 * Returns the value of the '<em><b>Volume Mounts</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.VolumeMount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Mounts</em>' containment reference list.
	 * @see k8s.K8sPackage#getContainers_VolumeMounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<VolumeMount> getVolumeMounts();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.EnvVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see k8s.K8sPackage#getContainers_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvVar> getEnv();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.ContainerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see k8s.K8sPackage#getContainers_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPort> getPorts();

} // Containers
